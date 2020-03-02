DESCRIPTION = "Blocking invocation client using bus agnostic api (baapi)"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/invoke_wait"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxb libamxj"

SRCREV = "f6b553bc77e87749477ff4b61ab3c8b9282c027b"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/invoke_wait.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/invoke_wait ${D}/bin/invoke_wait_ba_client
}
