DESCRIPTION = "Blocking invocation client using bus agnostic api (baapi)"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/invoke_wait"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxb libamxd libamxj"

SRCREV = "1e3ba651fdd56dba81b617cb6352fa7610ce27c6"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/invoke_wait.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/invoke_wait ${D}/bin/amx_invoke_wait
}
