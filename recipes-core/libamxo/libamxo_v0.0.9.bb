# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxo is a library to provide odl support."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxo/"
LICENSE = "MIT"
SECTION = "lib"
DEPENDS = "libamxc libamxp libamxd bison-native"

LIC_FILES_CHKSUM = "file://LICENSE;beginline=1;endline=21;md5=95e8fbfc71f3d0c82aee71089b47a04c"

SRCREV = "v0.0.9"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxo.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_LIB_DIR=lib"

do_install() {
        oe_runmake install
}
