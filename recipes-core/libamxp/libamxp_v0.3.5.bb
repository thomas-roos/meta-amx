# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxp is a library containing common patterns used in the amx project."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxp/"
LICENSE = "BSD-plus-patent"
SECTION = "lib"
DEPENDS = "libamxc bison-native"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b144ccd4a02477481c61bc89602d4400"

SRCREV = "v0.3.5"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxp.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_LIB_DIR=lib"

do_install() {
        oe_runmake install
}
