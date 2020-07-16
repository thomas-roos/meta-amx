# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxd is a library providing generic API for managing a data model"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxd/"
LICENSE = "BSD-plus-patent"
SECTION = "lib"
DEPENDS = "libamxc libamxp"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b144ccd4a02477481c61bc89602d4400"

SRCREV = "v0.5.4"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxd.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_LIB_DIR=lib"

do_install() {
        oe_runmake install
}
