

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/libraries/libamxd.git;protocol=https;nobranch=1"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Data model C-API"
LICENSE += "BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"
COMPONENT = "libamxd"



DEPENDS += "libamxc"
DEPENDS += "libamxp"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"

FILES:${PN}-dev += "${INCLUDEDIR}/amxd/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
