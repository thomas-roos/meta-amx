DESCRIPTION = "Data model runtime"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/applications/amxrt"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "applications"
DEPENDS = "libevent libamxc libamxp libamxd libamxb libamxo"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/applications/amxrt.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} PREFIX=${prefix} LIBDIR=${libdir} BINDIR=${bindir} INCLUDEDIR=${includedir} VERSION_PREFIX="

do_install() {
        oe_runmake install
}
