

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxm.git;protocol=https;nobranch=1"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "modularity api, simplifies creation of add-ons (plug-ins, modules)"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "libamxm"


DEPENDS += "libamxc"
DEPENDS += "libamxp"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"

FILES:${PN}-dev += "${INCLUDEDIR}/amxm/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
