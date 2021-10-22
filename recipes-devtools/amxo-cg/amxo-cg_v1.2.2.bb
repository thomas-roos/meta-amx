

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg.git;protocol=https;nobranch=1"
SRCREV = "v1.2.2"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Object Definition Language Compiler/Generator"
LICENSE += "BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"
COMPONENT = "amxo-cg"


DEPENDS += "libamxc"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libxml2"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "libamxo"
RDEPENDS_${PN} += "libxml2"

FILES_${PN} += "${BINDIR}/${COMPONENT}"
