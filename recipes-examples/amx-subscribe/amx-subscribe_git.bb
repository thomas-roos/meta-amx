DESCRIPTION = "Asynchronous (eventloop using libevent) subscription client using bus agnostic api (baapi)"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxb libamxd libevent"

SRCREV = "7bc9b4267516d8daa0d589bd4a01e03340f454b2"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/subscribe ${D}/bin/amx_subscribe
}
