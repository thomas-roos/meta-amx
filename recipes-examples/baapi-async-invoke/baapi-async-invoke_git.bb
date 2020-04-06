DESCRIPTION = "Asynchronous (eventloop using libevent) client using bus agnostic api (baapi)"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/async_invoke"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxj libamxb libamxd libevent"

SRCREV = "b037deb61ebe5b29c35cf3ac29e385145e4d09ce"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/async_invoke.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/async_invoke ${D}/bin/async_ba_client
}
