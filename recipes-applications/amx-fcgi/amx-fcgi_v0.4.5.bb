

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi.git;protocol=https;nobranch=1"
SRCREV = "v0.4.5"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Ambiorix Fast CGI app for web-servers"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "amx-fcgi"



export CONFIG_SAH_AMX_FCGI
export CONFIG_REST_API_WEBUI_DEMO

CONFIG_SAH_AMX_FCGI ??= "y"
CONFIG_REST_API_WEBUI_DEMO ??= "${@ "n" if ( d.getVar("CONFIG_SAH_AMX_FCGI") != "n") else "n" }"

SAH_CONFIG += " \
                CONFIG_SAH_AMX_FCGI \
                CONFIG_REST_API_WEBUI_DEMO \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libamxb"
DEPENDS += "libamxa"
DEPENDS += "fcgi"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxa"
RDEPENDS:${PN} += "fcgi"
RDEPENDS:${PN} += "lighttpd"
RDEPENDS:${PN} += "lighttpd-module-cgi"
RDEPENDS:${PN} += "lighttpd-module-fastcgi"
RDEPENDS:${PN} += "lighttpd-module-auth"
RDEPENDS:${PN} += "${@ "lighttpd-module-expire" if (d.getVar("CONFIG_REST_API_WEBUI_DEMO") == "y") else ""}"
RDEPENDS:${PN} += "lighttpd-module-authn-file"
RDEPENDS:${PN} += "lighttpd-module-proxy"

inherit update-rc.d
INITSCRIPT_NAME = "${COMPONENT}"

INITSCRIPT_PARAMS = "start 85 2 3 4 5 . stop 10 0 1 6 ."

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

do_install() {
        oe_runmake install
}

FILES:${PN} += "/etc/amx/amx-fcgi/amx-fcgi.odl"
FILES:${PN} += "/usr/lib/amx/amx-fcgi/amx-fcgi.so"
FILES:${PN} += "${BINDIR}/amx-fcgi"
FILES:${PN} += "${INITDIR}/${COMPONENT}"
FILES:${PN} += "${PROCMONDIR}/${COMPONENT}"
FILES:${PN} += "${LIBDIR}/debuginfo/D10${COMPONENT}"
