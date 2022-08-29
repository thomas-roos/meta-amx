

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa.git;protocol=https;nobranch=1"
SRCREV = "v0.4.25"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Access control verification"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "libamxa"


DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libamxd"
DEPENDS += "libamxb"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxj"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "libamxb"

FILES_${PN}-dev += "${INCLUDEDIR}/amxa/*.h"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
