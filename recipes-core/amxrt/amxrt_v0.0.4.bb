DESCRIPTION = "Data model runtime"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/applications/amxrt"
LICENSE = "CLOSED"
SECTION = "applications"
DEPENDS = "libevent libamxc libamxp libamxd libamxb libamxo"

SRCREV = "v0.0.4"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/applications/amxrt.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_BIN_DIR=bin"

do_install() {
        oe_runmake install
}
