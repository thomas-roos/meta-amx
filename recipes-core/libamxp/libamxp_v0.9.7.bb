

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/libraries/libamxp.git;protocol=https;nobranch=1"
SRCREV = "v0.9.7"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Common patterns implementation"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf \
          "

COMPONENT = "libamxp"


DEPENDS += "libamxc"
DEPENDS += "bison-native"
DEPENDS += "flex-native"

RDEPENDS_${PN} += "libamxc"

FILES_${PN}-dev += "${INCLUDEDIR}/amxp/*.h"
FILES_${PN}-staticdev += "${LIBDIR}/${COMPONENT}.a"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
