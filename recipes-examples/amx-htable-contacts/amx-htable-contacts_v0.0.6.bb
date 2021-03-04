DESCRIPTION = "The contacts example exist in three different implementations. One to demonstrate the libamxc llist API, one to demonstrate the libamxc htable API and one to demonstrate the libamxc variants API. Here the htable (hash table) implementation is handled."
HOMEPAGE = "//https://${GIT_BASE_URL}/ambiorix/examples/collections/htable_contacts/"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "examples"
DEPENDS = "libamxc"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/collections/htable_contacts.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} VERSION_PREFIX="

do_install() {
        oe_runmake install
}
