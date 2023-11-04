

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc.git;protocol=https;nobranch=1"
SRCREV = "v1.10.0"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Libamxc is a library containing data containers, implemented in ansi C (C99)."
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "libamxc"



export CONFIG_SAH_LIB_AMXC

CONFIG_SAH_LIB_AMXC ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_AMXC \
                "



EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN}-dev += "${INCLUDEDIR}/amxc/*.h"
FILES:${PN}-staticdev += "${LIBDIR}/${COMPONENT}.a"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
