DESCRIPTION = "Simple example greeter application build using the amx APIs"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/datamodel/greeter_plugin"
LICENSE = "BSD-plus-patent"
SECTION = "examples"
DEPENDS = "libamxc libamxp libamxd libamxo libevent"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b144ccd4a02477481c61bc89602d4400"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/datamodel/greeter_plugin.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_BIN_DIR=/bin VERSION_PREFIX="


do_install() {
    oe_runmake install
}

FILES_${PN} += "${bindir}/greeter"
FILES_${PN} += "/etc/amx/greeter/*.odl"
FILES_${PN} += "/usr/lib/amx/greeter/*.so"
