DESCRIPTION = "Bus Agnostic back-ends are shared objects that implements the bus specific functionality. As these are loaded dynamically from within an application, we must be sure that they are valid. This tool verifies that a shared object is a valid and usable amxb back-end."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "tools"
DEPENDS = "libamxb libamxd"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/applications/amxb-inspect.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE += "DEST=${D} VERSION_PREFIX="

do_install() {
    oe_runmake install
}
