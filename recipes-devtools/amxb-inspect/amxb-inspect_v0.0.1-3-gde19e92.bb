DESCRIPTION = "Bus Agnostic back-ends are shared objects that implements the bus specific functionality. As these are loaded dynamically from within an application, we must be sure that they are valid. This tool verifies that a shared object is a valid and usable amxb back-end."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe"
LICENSE = "CLOSED"
SECTION = "tools"
DEPENDS = "libamxb libamxd"

SRCREV = "de19e922d9786ea6f805b744d331a25792154cbd"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/applications/amxb-inspect.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/amxb-inspect ${D}/bin/amxb-inspect
}
