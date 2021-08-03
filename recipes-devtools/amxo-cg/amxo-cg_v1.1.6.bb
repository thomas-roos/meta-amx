DESCRIPTION = "Object Definition Language Compiler/Generator"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/applications/amxo-cg"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "tools"
DEPENDS = "libamxc libamxd libamxo libxml2"
DEPENDS_class-native = "libamxb-native libamxd-native libamxo-native"

inherit pkgconfig config-amx 

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/applications/amxo-cg.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} PREFIX=${prefix} LIBDIR=${libdir} BINDIR=${bindir} INCLUDEDIR=${includedir} VERSION_PREFIX="

do_install() {
        oe_runmake install
}

BBCLASSEXTEND += "native"
