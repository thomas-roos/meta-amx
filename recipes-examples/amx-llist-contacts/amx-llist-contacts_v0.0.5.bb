DESCRIPTION = "The contacts example exist in three different implementations. One to demonstrate the libamxc llist API, one to demonstrate the libamxc htable API and one to demonstrate the libamxc variants API. Here the llist (linked list) implementation is handled."
HOMEPAGE = "//https://${GIT_BASE_URL}/ambiorix/examples/collections/llist_contacts/"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/collections/llist_contacts.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} VERSION_PREFIX="

do_install() {
        oe_runmake install
}
