

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxm.git;protocol=https;nobranch=1"
SRCREV = "v0.0.42"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "modularity api, simplifies creation of add-ons (plug-ins, modules)"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "libamxm"


DEPENDS += "libamxc"
DEPENDS += "libamxp"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxp"

FILES_${PN}-dev += "${INCLUDEDIR}/amxm/*.h"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
