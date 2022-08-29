

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd.git;protocol=https;nobranch=1"
SRCREV = "v3.6.17"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Data model C-API"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "libamxd"


DEPENDS += "libamxc"
DEPENDS += "libamxp"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxp"

FILES_${PN}-dev += "${INCLUDEDIR}/amxd/*.h"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
