DESCRIPTION = "Simple example greeter application build using the amx APIs"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_greeter"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxp libamxb libamxd libevent"

SRCREV = "c316876259ee8a4f8f4fcbdfd2a75e66f519d3ee"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_greeter.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/amx_greeter ${D}/bin/amx_greeter
}
