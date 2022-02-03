

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo.git;protocol=https;nobranch=1"
SRCREV = "v1.4.12"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Ambiorix Object Definition Language library"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "libamxo"


DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "bison-native"
DEPENDS += "flex-native"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"

FILES:${PN}-dev += "${INCLUDEDIR}/amxo/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
