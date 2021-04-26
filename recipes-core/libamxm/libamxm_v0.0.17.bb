# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxm makes it possible for an executable to load in shared objects (.so files), the shared object can then register functions that the executable can use."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxm/"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "lib"
DEPENDS = "libamxc libamxp"
DEPENDS_class-native = "libamxc-native libamxp-native"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxm.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} PREFIX=${prefix} LIBDIR=${libdir} BINDIR=${bindir} INCLUDEDIR=${includedir} VERSION_PREFIX="

do_install() {
        oe_runmake install
}

BBCLASSEXTEND += "native"
