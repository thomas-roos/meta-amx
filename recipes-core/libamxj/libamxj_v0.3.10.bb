# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxj is an extension library for libamxc. The library provides a JSON parser generator using yajl and libamxc variants."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxj/"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "lib"
DEPENDS = "libamxc yajl"
DEPENDS_class-native = "libamxc-native yajl-native"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxj.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} PREFIX=${prefix} LIBDIR=${libdir} BINDIR=${bindir} INCLUDEDIR=${includedir} VERSION_PREFIX="

do_install() {
        oe_runmake install
}

BBCLASSEXTEND += "native"
