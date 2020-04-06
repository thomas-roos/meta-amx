DESCRIPTION = "Synchronous (no eventloop) client using bus agnostic api (baapi)"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/sync_invoke"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxj libamxb libamxd"

SRCREV = "a0a4c9c79320bed43407d44ab35f579ec8b54532"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/sync_invoke.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/sync_invoke ${D}/bin/sync_ba_client
}
