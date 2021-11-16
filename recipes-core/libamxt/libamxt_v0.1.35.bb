

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt.git;protocol=https;nobranch=1"
SRCREV = "v0.1.35"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Common patterns implementation"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "libamxt"


DEPENDS += "libamxc"
DEPENDS += "libamxp"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxp"

FILES_${PN}-dev += "${INCLUDEDIR}/amxt/*.h"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
