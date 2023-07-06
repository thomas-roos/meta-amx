# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://lcmwebpython.py"
SRC_URI += "file://script.sh"
SRC_URI += "file://styles.css"

S = "${WORKDIR}"

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

# No information for SRC_URI yet (only an external source tree was specified)

# NOTE: no Makefile found, unable to determine what needs to be done
DEPENDS += "python3"
RDEPENDS:${PN} += "python3"


do_configure () {
        # Specify any needed configure commands here
        :
}

do_compile () {
        # Specify compilation commands here
        :
}

do_install () {
        install -d ${D}/usr/srv
        install -D -p -m 0755 lcmwebpython.py ${D}/usr/srv/
        install -D -p -m 0755 styles.css ${D}/usr/srv/
}

FILES:${PN} += "/etc/init.d/lcmwebpython"
FILES:${PN} += "/usr/srv/lcmwebpython.py"
FILES:${PN} += "/usr/srv/styles.css"


do_install:append () {
        # Specify install commands here
    install -d ${D}/etc/init.d
    install -D -p -m 0755 script.sh ${D}/etc/init.d/lcmwebpython
}

inherit update-rc.d
INITSCRIPT_NAME = "lcmwebpython"
INITSCRIPT_PARAMS = "start 99 2 3 4 5 . stop 10 0 1 6 ."