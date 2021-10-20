

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc.git;protocol=https;nobranch=1"
SRCREV = "v1.4.0"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Libamxc is a library containing data containers, implemented in ansi C (C99)."
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE.SAH;md5=a0f6bf5b78959aa070b853b0ad21d9a2 \
                    file://LICENSE.BSD;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf \
                    "

COMPONENT = "libamxc"




FILES_${PN}-dev += "${INCLUDEDIR}/amxc/*.h"
FILES_${PN}-staticdev += "${LIBDIR}/${COMPONENT}.a"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
