# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxt is a library providing functions to make it easier to create an interactive terminal based interface."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxt/"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "lib"
DEPENDS = "libamxc libamxp"
DEPENDS_class-native = "libamxc-native libamxp-native"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxt.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} PREFIX=${prefix} LIBDIR=${libdir} BINDIR=${bindir} INCLUDEDIR=${includedir} VERSION_PREFIX="

do_install() {
        oe_runmake install
}

BBCLASSEXTEND += "native"
