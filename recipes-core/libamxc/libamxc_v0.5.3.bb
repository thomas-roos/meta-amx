# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxc is a library containing data containers, implemented in ansi C (C99)."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxc/"
LICENSE = "BSD-plus-patent"
SECTION = "lib"
DEPENDS = ""

LIC_FILES_CHKSUM = "file://LICENSE;beginline=1;endline=21;md5=95e8fbfc71f3d0c82aee71089b47a04c"

SRCREV = "v0.5.3"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxc.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_LIB_DIR=lib"

do_install() {
        oe_runmake install
}
