# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxp is a library containing common patterns used in the amx project."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxp/"
LICENSE = "MIT"
SECTION = "lib"
DEPENDS = "libamxc"

LIC_FILES_CHKSUM = "file://LICENSE;beginline=1;endline=21;md5=95e8fbfc71f3d0c82aee71089b47a04c"

SRCREV = "v0.1.7"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxp.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_LIB_DIR=lib"

do_install() {
        oe_runmake install
}
