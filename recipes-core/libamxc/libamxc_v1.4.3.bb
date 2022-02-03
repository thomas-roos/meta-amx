

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc.git;protocol=https;nobranch=1"
SRCREV = "v1.4.3"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Libamxc is a library containing data containers, implemented in ansi C (C99)."
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "libamxc"




FILES:${PN}-dev += "${INCLUDEDIR}/amxc/*.h"
FILES:${PN}-staticdev += "${LIBDIR}/${COMPONENT}.a"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
