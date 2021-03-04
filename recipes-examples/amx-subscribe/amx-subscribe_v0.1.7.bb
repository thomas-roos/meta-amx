DESCRIPTION = "Asynchronous (eventloop using libevent) subscription client using bus agnostic api (baapi)"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "examples"
DEPENDS = "libamxc libamxb libamxd libevent"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} VERSION_PREFIX="

do_install() {
        oe_runmake install
}
