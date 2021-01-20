DESCRIPTION = "Simple standalone example greeter application build using the amx APIs"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/datamodel/greeter_app"
LICENSE = "BSD-plus-patent"
SECTION = "examples"
DEPENDS = "libamxc libamxp libamxd libamxo libamxb libevent"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b144ccd4a02477481c61bc89602d4400"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/datamodel/greeter_app.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} VERSION_PREFIX="

do_install() {
    oe_runmake install
}

FILES_${PN} += "${bindir}/greeter"
FILES_${PN} += "/etc/amx/greeter/*.odl"
