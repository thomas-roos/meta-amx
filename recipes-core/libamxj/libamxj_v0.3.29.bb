

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/libraries/libamxj.git;protocol=https;nobranch=1"
SRCREV = "v0.3.29"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "JSON parser & generator using yajl and libamxc variants"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf \
          "

COMPONENT = "libamxj"


DEPENDS += "libamxc"
DEPENDS += "yajl"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "yajl"

FILES_${PN}-dev += "${INCLUDEDIR}/amxj/*.h"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
