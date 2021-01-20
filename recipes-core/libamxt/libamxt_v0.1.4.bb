# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxt is a library providing functions to make it easier to create an interactive terminal based interface."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxt/"
LICENSE = "BSD-plus-patent"
SECTION = "lib"
DEPENDS = "libamxc libamxp"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b144ccd4a02477481c61bc89602d4400"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxt.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} LIBDIR=/usr/lib VERSION_PREFIX="

do_install() {
        oe_runmake install
}
