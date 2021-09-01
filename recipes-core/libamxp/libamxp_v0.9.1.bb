

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/libraries/libamxp.git;protocol=https;nobranch=1"
SRCREV = "v0.9.1"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Common patterns implementation"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE.SAH;md5=a0f6bf5b78959aa070b853b0ad21d9a2 \
                    file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf \
                    "

COMPONENT = "libamxp"

DEPENDS += "libamxc"
DEPENDS += "bison-native"

RDEPENDS_${PN} += "libamxc"

FILES_${PN}-dev += "${INCLUDEDIR}/amxp/*.h"
FILES_${PN}-staticdev += "${LIBDIR}/${COMPONENT}.a"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
