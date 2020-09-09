DESCRIPTION = "Bus Agnostic back-ends are shared objects that implements the bus specific functionality. As these are loaded dynamically from within an application, we must be sure that they are valid. This tool verifies that a shared object is a valid and usable amxb back-end."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe"
LICENSE = "BSD-plus-patent"
SECTION = "tools"
DEPENDS = "libamxb libamxd"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b144ccd4a02477481c61bc89602d4400"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/applications/amxb-inspect.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE += "VERSION_PREFIX="

do_install() {
    install -D -m 0755 ${B}/amxb-inspect ${D}/bin/amxb-inspect
}
