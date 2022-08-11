

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxj.git;protocol=https;nobranch=1"
SRCREV = "v0.3.36"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "JSON parser & generator using yajl and libamxc variants"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "libamxj"


DEPENDS += "libamxc"
DEPENDS += "yajl"

<<<<<<< HEAD
RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "yajl"

FILES:${PN}-dev += "${INCLUDEDIR}/amxj/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
=======
RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "yajl"

FILES_${PN}-dev += "${INCLUDEDIR}/amxj/*.h"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
>>>>>>> origin/dev_mod-amxb-pcb_upstep
