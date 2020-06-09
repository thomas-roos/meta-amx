DESCRIPTION = "Asynchronous (eventloop using libevent) subscription client using bus agnostic api (baapi)"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxb libamxd libevent"

SRCREV = "33321ebc389c9a99a728d51a80bfd1925c1fd80a"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/subscribe ${D}/bin/amx_subscribe
}
