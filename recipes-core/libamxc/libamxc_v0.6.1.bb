# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxc is a library containing data containers, implemented in ansi C (C99)."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxc/"
LICENSE = "BSD-plus-patent"
SECTION = "lib"
DEPENDS = ""

LIC_FILES_CHKSUM = "file://LICENSE;md5=b144ccd4a02477481c61bc89602d4400"

SRCREV = "v0.6.1"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxc.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_LIB_DIR=lib"

do_install() {
        oe_runmake install
}
