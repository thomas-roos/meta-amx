DESCRIPTION = "Simple example greeter application build using the amx APIs"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/datamodel/greeter_plugin"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "examples"
DEPENDS = "libamxc libamxp libamxd libamxo libevent"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SOLIBS = ".so"
SOLIBSDEV = ".so.*"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/datamodel/greeter_plugin.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} VERSION_PREFIX="

RDEPENDS_${PN} = "\
                 amxrt \
                 "

do_install() {
    oe_runmake install
}

FILES_${PN} += "${bindir}/greeter"
FILES_${PN} += "/etc/amx/greeter/*.odl"
FILES_${PN} += "/usr/lib/amx/greeter/*${SOLIBS}"
FILES_${PN}-dev += "/usr/lib/amx/greeter/*${SOLIBSDEV}"