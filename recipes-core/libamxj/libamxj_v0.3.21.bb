

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/libraries/libamxj.git;protocol=https;nobranch=1"
SRCREV = "v0.3.21"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "JSON parser & generator using yajl and libamxc variants"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE.SAH;md5=a0f6bf5b78959aa070b853b0ad21d9a2 \
                    file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf \
                    "

COMPONENT = "libamxj"



DEPENDS += "libamxc"
DEPENDS += "yajl"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "yajl"

FILES_${PN}-dev += "${INCLUDEDIR}/amxj/*.h"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
