# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxj is an extension library for libamxc. The library provides a JSON parser generator using yajl and libamxc variants."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxj/"
LICENSE = "BSD-plus-patent"
SECTION = "lib"
DEPENDS = "libamxc yajl"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b144ccd4a02477481c61bc89602d4400"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxj.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_LIB_DIR=lib VERSION_PREFIX="

do_install() {
        oe_runmake install
}
