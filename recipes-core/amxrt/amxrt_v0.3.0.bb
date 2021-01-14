DESCRIPTION = "Data model runtime"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/applications/amxrt"
LICENSE = "BSD-plus-patent"
SECTION = "applications"
DEPENDS = "libevent libamxc libamxp libamxd libamxb libamxo"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b144ccd4a02477481c61bc89602d4400"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/applications/amxrt.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_BIN_DIR=bin VERSION_PREFIX="

do_install() {
        oe_runmake install
}
