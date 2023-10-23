# Python 3 Web page using pythno amx-usp

from http.server import BaseHTTPRequestHandler, HTTPServer
import urllib.parse
from urllib.parse import urlparse
from urllib import parse
import time
import sys
import pamx
import pprint
import platform
import json

hostName = "0.0.0.0"
serverPort = 6060
amx_error = None

# Init python AMX USP
def initialize_amx_usp():
    pamx.backend.load("/usr/bin/mods/amxb/mod-amxb-usp.so")
    pamx.backend.set_config({})
    connection = pamx.bus.connect("usp:/var/run/usp/endpoint_agent_path")
    return connection

# Python AMX functions : get/set/add/delete
def read_object(path):
    return connection.get(path)

def set_object(path, params):
    return connection.set(path, json.loads(params))

def add_object(path, params):
    return connection.add(path, json.loads(params))

def del_object(path):
    return connection.delete(path)


class MyServer(BaseHTTPRequestHandler):
    def do_GET(self):
        s = self.path
        my_dict = urllib.parse.parse_qs(s[2:])

        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.end_headers()

        if self.path == "/styles.css":
            with open('/usr/srv/styles.css', 'rb') as file:
                self.wfile.write(file.read())
                return

        html = '<html><head> \
                    <title>Python AMX binding test</title> \
                    <link rel="stylesheet" href="styles.css">\
            </head>'


        self.wfile.write(bytes(html, "utf-8"))

        self.wfile.write(bytes("<html><head><title>Python AMX binding</title></head>", "utf-8"))

        self.wfile.write(bytes("<body>", "utf-8"))
        if amx_error is not None:
            error_string = "<p>Error to init AMX-USP (" + str(amx_error) + "). Cannot use get/set functionnalities.</p>"
            self.wfile.write(bytes(error_string, "utf-8"))
            self.wfile.write(bytes("</body></html>", "utf-8"))
            return

        self.wfile.write(bytes("<h1>WebServer using python AMX-USP binding </h1>", "utf-8"))

        #### Get section ####
        self.wfile.write(bytes("<h2><br>Get value from host datamodel</h2>", "utf-8"))
        linkdoc = 'Syntax documentation here : <a href="https://gitlab.com/prpl-foundation/components/ambiorix/bindings/python3#connectionget">link</a>'
        self.wfile.write(bytes(linkdoc, "utf-8"))

        get_example = '<p>Path example: <b><i>Bridging.Bridge.</i></b> </p>'
        self.wfile.write(bytes(get_example, "utf-8"))

        get_field = '<form><label for="fname">Path to objects or parameters : </label> \
                    <input type="text" id="gpath" name="gpath"><br><br><input type="submit" value="Get"></form><hr/>'
        self.wfile.write(bytes(get_field, "utf-8"))


        #### Set section ####
        self.wfile.write(bytes("<h2><br>Set parameters in host datamodel</h2>", "utf-8"))
        linkdoc = 'Syntax documentation here: <a href="https://gitlab.com/prpl-foundation/components/ambiorix/bindings/python3#connectionset">link</a>'
        self.wfile.write(bytes(linkdoc, "utf-8"))

        set_example = '<p>Path example: <b><i>Bridging.Bridge.testbridge.</i></b><br>Parameters example: "<b><i>{"Enable" : "False"}</i></b> </p>'
        self.wfile.write(bytes(set_example, "utf-8"))

        set_field = '<form><label for="spath">Path : </label><input type="text" id="spath" name="spath"><br><label for="sparams">Set Parameters  : \
                        </label><input type="text" id="sparams" name="sparams"> <br><br><input type="submit" value="Set"></form> \
                        <hr/>'
        self.wfile.write(bytes(set_field, "utf-8"))


        #### Add section ####
        self.wfile.write(bytes("<h2><br>Add objects in host datamodel</h2>", "utf-8"))
        linkdoc = 'Syntax documentation here: <a href="https://gitlab.com/prpl-foundation/components/ambiorix/bindings/python3#connectionadd">link</a>'
        self.wfile.write(bytes(linkdoc, "utf-8"))

        add_example = '<p>Path example: <b><i>Bridging.Bridge</i></b><br>Parameters example: "<b><i>{"Enable" : "False", "Alias" : "testbridge"}</i></b> </p>'
        self.wfile.write(bytes(add_example, "utf-8"))

        set_field = '<form><label for="apath">Path : </label><input type="text" id="apath" name="apath"><br><label for="aparam">Add Parameters  : </label> \
                        <input type="text" id="aparams" name="aparams"><br><br><input type="submit" value="Add"></form> \
                        <hr/>'
        self.wfile.write(bytes(set_field, "utf-8"))


        #### Delete section ####
        self.wfile.write(bytes("<h2><br>Delete objects in host datamodel</h2>", "utf-8"))
        linkdoc = 'Syntax documentation here: <a href="https://gitlab.com/prpl-foundation/components/ambiorix/bindings/python3#connectiondelete">link</a>'
        self.wfile.write(bytes(linkdoc, "utf-8"))

        del_example = '<p>Path example: <b><i>Bridging.Bridge.testbridge.</i></b></p>'
        self.wfile.write(bytes(del_example, "utf-8"))

        set_field = '<form><label for="dpath">Path      : </label><input type="text" id="dpath" name="dpath"><br><br><input type="submit" value="Del"></form><hr/>'
        self.wfile.write(bytes(set_field, "utf-8"))


        if 'gpath' in my_dict:
            get_path = my_dict['gpath'][0]
            try:
                res = read_object(get_path)
            except Exception as e:
                self.wfile.write(bytes("<h2>Result:</h2>", "utf-8"))
                self.wfile.write(bytes("<p>Error on request: " + str(e) + "</p>", "utf-8"))
            else:
                self.wfile.write(bytes("<h2>Result:</h2>", "utf-8"))
                self.wfile.write(bytes("<p>Object retrieved properly</p>", "utf-8"))
                self.wfile.write(bytes("<pre id=\"json\">"+json.dumps(res, indent=4)+"</pre>", "utf-8"))
        elif 'spath' in my_dict and 'sparams' in my_dict:
                set_path = my_dict['spath'][0]
                set_params = my_dict['sparams'][0]
                try:
                    res = set_object(set_path, set_params)
                except Exception as e:
                    self.wfile.write(bytes("<h2>Result:</h2>", "utf-8"))
                    self.wfile.write(bytes("<p>Error on request: " + str(e) + "</p>", "utf-8"))
                else:
                    self.wfile.write(bytes("<h2>Result:</h2>", "utf-8"))
                    self.wfile.write(bytes("<p>Value set properly</p>", "utf-8"))
                    self.wfile.write(bytes("<pre id=\"json\">"+json.dumps(res, indent=4)+"</pre>", "utf-8"))
        elif 'apath' in my_dict:
            add_path = my_dict['apath'][0]
            add_params = '{}'
            if 'aparams' in my_dict:
                add_params = my_dict['aparams'][0]
            try:
                res = add_object(add_path, add_params)
            except Exception as e:
                self.wfile.write(bytes("<h2>Result:</h2>", "utf-8"))
                self.wfile.write(bytes("<p>Error on request: " + str(e) + "</p>", "utf-8"))
            else:
                self.wfile.write(bytes("<h2>Result:</h2>", "utf-8"))
                self.wfile.write(bytes("<p>Object added properly</p>", "utf-8"))
                self.wfile.write(bytes("<pre id=\"json\">"+json.dumps(res, indent=4)+"</pre>", "utf-8"))
        elif 'dpath' in my_dict:
            del_path = my_dict['dpath'][0]
            try:
                res = del_object(del_path)
            except Exception as e:
                self.wfile.write(bytes("<h2>Result:</h2>", "utf-8"))
                self.wfile.write(bytes("<p>Error on request: " + str(e) + "</p>", "utf-8"))
            else:
                self.wfile.write(bytes("<h2>Result:</h2>", "utf-8"))
                self.wfile.write(bytes("<p>Object deleted properly</p>", "utf-8"))
                self.wfile.write(bytes("<pre id=\"json\">"+json.dumps(res, indent=4)+"</pre>", "utf-8"))


        self.wfile.write(bytes("</body></html>", "utf-8"))


if __name__ == "__main__":
    webServer = HTTPServer((hostName, serverPort), MyServer)
    print("Server started http://%s:%s" % (hostName, serverPort))

    try:
        connection = initialize_amx_usp()
    except Exception as e:
        print("Could not init amx-usp: " + str(e))
        amx_error = e

    try:
        webServer.serve_forever()
    except KeyboardInterrupt:
        webServer.server_close()

    webServer.server_close()
    print("Server stopped.")