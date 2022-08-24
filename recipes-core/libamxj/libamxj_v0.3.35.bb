

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxj.git;protocol=https;nobranch=1"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "JSON parser & generator using yajl and libamxc variants"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "libamxj"


DEPENDS += "libamxc"
DEPENDS += "yajl"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "yajl"

FILES:${PN}-dev += "${INCLUDEDIR}/amxj/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
