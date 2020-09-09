DESCRIPTION = "Asynchronous (eventloop using libevent) subscription client using bus agnostic api (baapi)"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxb libamxd libevent"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/subscribe.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_BIN_DIR=/bin VERSION_PREFIX="

do_install() {
        oe_runmake install
}

do_install() {
    oe_runmake install
}
