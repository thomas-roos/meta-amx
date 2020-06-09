# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxd is a library providing generic API for managing a data model"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxd/"
LICENSE = "MIT"
SECTION = "lib"
DEPENDS = "libamxc libamxp"

LIC_FILES_CHKSUM = "file://LICENSE;beginline=1;endline=21;md5=95e8fbfc71f3d0c82aee71089b47a04c"

SRCREV = "v0.3.0"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxd.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_LIB_DIR=lib"

do_install() {
        oe_runmake install
}
