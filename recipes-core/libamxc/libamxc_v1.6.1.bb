

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc.git;protocol=https;nobranch=1"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Libamxc is a library containing data containers, implemented in ansi C (C99)."
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "libamxc"




FILES:${PN}-dev += "${INCLUDEDIR}/amxc/*.h"
FILES:${PN}-staticdev += "${LIBDIR}/${COMPONENT}.a"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
