DESCRIPTION = "Asynchronous (eventloop using libevent) client using bus agnostic api (baapi)"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/async_invoke"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxj libamxb libevent"

SRCREV = "6eb451e46acb9acf0bb52c5262b88784fffc4063"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/async_invoke.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/async_invoke ${D}/bin/async_ba_client
}
