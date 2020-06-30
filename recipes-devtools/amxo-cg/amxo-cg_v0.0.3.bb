DESCRIPTION = "Object Definition Language Compiler/Generator"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/applications/amxo-cg"
LICENSE = "CLOSED"
SECTION = "tools"
DEPENDS = "libamxc libamxd libamxo"

SRCREV = "v0.0.3"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/applications/amxo-cg.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_BIN_DIR=bin"

do_install() {
        oe_runmake install
}
