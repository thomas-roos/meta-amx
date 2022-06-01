

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp.git;protocol=https;nobranch=1"
SRCREV = "v0.10.1"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Common patterns implementation"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "libamxp"


DEPENDS += "libamxc"
DEPENDS += "bison-native"
DEPENDS += "flex-native"

RDEPENDS:${PN} += "libamxc"

FILES:${PN}-dev += "${INCLUDEDIR}/amxp/*.h"
FILES:${PN}-staticdev += "${LIBDIR}/${COMPONENT}.a"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
