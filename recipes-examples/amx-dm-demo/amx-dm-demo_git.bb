DESCRIPTION = "Ambiorix DM Demo application"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_dm_demo"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxb libamxd libamxp libevent"

SRCREV = "dee2fecc6053c8d66854ab983ab4c84560799abb"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_dm_demo.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/amx_dm_demo ${D}/bin/amx_dm_demo
}
