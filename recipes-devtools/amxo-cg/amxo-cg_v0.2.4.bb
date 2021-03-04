DESCRIPTION = "Object Definition Language Compiler/Generator"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/applications/amxo-cg"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "tools"
DEPENDS = "libamxc libamxd libamxo"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/applications/amxo-cg.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} VERSION_PREFIX="

do_install() {
        oe_runmake install
}
