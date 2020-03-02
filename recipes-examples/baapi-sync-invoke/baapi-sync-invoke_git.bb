DESCRIPTION = "Synchronous (no eventloop) client using bus agnostic api (baapi)"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/sync_invoke"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxj libamxb"

SRCREV = "56272231ce058320d3406e346574dd1981ef5310"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/sync_invoke.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/sync_invoke ${D}/bin/sync_ba_client
}
