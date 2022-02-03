

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt.git;protocol=https;nobranch=1"
SRCREV = "v0.1.37"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Common patterns implementation"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "libamxt"


DEPENDS += "libamxc"
DEPENDS += "libamxp"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"

FILES:${PN}-dev += "${INCLUDEDIR}/amxt/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
