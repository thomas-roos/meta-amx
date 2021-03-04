# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxo is a library to provide odl support."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxo/"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "lib"
DEPENDS = "libamxc libamxp libamxd bison-native"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxo.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} LIBDIR=/usr/lib VERSION_PREFIX="

do_install() {
        oe_runmake install
}
