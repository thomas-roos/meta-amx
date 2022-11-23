

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs.git;protocol=https;nobranch=1"
SRCREV = "v0.1.44"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Data model synchronization C-API"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "libamxs"


DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxb"
DEPENDS += "libamxd"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxp"
RDEPENDS_${PN} += "libamxb"
RDEPENDS_${PN} += "libamxd"

FILES_${PN}-dev += "${INCLUDEDIR}/amxs/*.h"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
