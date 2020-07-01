DESCRIPTION = "Bus Agnostic back-ends are shared objects that implements the bus specific functionality. As these are loaded dynamically from within an application, we must be sure that they are valid. This tool verifies that a shared object is a valid and usable amxb back-end."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe"
LICENSE = "BSD-plus-patent"
SECTION = "tools"
DEPENDS = "libamxb libamxd"

LIC_FILES_CHKSUM = "file://LICENSE;beginline=1;endline=21;md5=95e8fbfc71f3d0c82aee71089b47a04c"

SRCREV = "v0.0.3"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/applications/amxb-inspect.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/amxb-inspect ${D}/bin/amxb-inspect
}
