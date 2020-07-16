DESCRIPTION = "Object Definition Language Compiler/Generator"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/applications/amxo-cg"
LICENSE = "BSD-plus-patent"
SECTION = "tools"
DEPENDS = "libamxc libamxd libamxo"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b144ccd4a02477481c61bc89602d4400"

SRCREV = "v0.0.4"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/applications/amxo-cg.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_BIN_DIR=bin"

do_install() {
        oe_runmake install
}
