DESCRIPTION = "Simple example greeter application build using the amx APIs"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_greeter"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxp libamxb libamxd libevent"

SRCREV = "15b4c24c2159eabd50e6ac7d3c50ae83c1c04946"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_greeter.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/amx_greeter ${D}/bin/amx_greeter
}
