

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa.git;protocol=https;nobranch=1"
SRCREV = ""
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Access control verification"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "libamxa"


DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libamxd"
DEPENDS += "libamxb"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"

FILES:${PN}-dev += "${INCLUDEDIR}/amxa/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
