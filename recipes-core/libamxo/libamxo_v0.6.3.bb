# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxo is a library to provide odl support."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxo/"
LICENSE = "BSD-plus-patent"
SECTION = "lib"
DEPENDS = "libamxc libamxp libamxd bison-native"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b144ccd4a02477481c61bc89602d4400"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxo.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_LIB_DIR=lib VERSION_PREFIX="

do_install() {
        oe_runmake install
}
