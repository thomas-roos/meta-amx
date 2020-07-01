DESCRIPTION = "Object Definition Language Compiler/Generator"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/applications/amxo-cg"
LICENSE = "BSD-plus-patent"
SECTION = "tools"
DEPENDS = "libamxc libamxd libamxo"

LIC_FILES_CHKSUM = "file://LICENSE;beginline=1;endline=21;md5=95e8fbfc71f3d0c82aee71089b47a04c"

SRCREV = "v0.0.3"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/applications/amxo-cg.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_BIN_DIR=bin"

do_install() {
        oe_runmake install
}
