DESCRIPTION = "Asynchronous (eventloop using libevent) subscription client using bus agnostic api (baapi)"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxb libevent"

SRCREV = "e9c4699f219cb732620c898831d6333f54a68435"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/subscribe ${D}/bin/subscribe_ba_client
}
