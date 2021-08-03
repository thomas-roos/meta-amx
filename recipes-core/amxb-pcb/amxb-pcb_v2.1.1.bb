# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "PCB back-end implementation for bus agnostic API."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/modules/amxb_backends/amxb_pcb"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "base"
DEPENDS = "libamxc libamxb libamxd libpcb"
DEPENDS_class-native = "libamxc-native libamxb-native libamxd-native libpcb-native"

inherit sah_base pkgconfig

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/modules/amxb_backends/amxb_pcb.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} PREFIX=${prefix} LIBDIR=${libdir} BINDIR=${bindir} INCLUDEDIR=${includedir} VERSION_PREFIX="

do_install() {
        oe_runmake install
}

BBCLASSEXTEND += "native"
