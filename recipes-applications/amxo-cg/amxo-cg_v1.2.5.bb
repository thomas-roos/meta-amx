

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg.git;protocol=https;nobranch=1"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Object Definition Language Compiler/Generator"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "amxo-cg"


DEPENDS += "libamxc"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libxml2"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libxml2"

FILES:${PN} += "${BINDIR}/${COMPONENT}"
