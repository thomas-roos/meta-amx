

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxm.git;protocol=https;nobranch=1"
SRCREV = "v0.0.66"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "modularity API, simplifies creation of plug-ins"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=cd9db409406fd4c7234d852479547016"

COMPONENT = "libamxm"



export CONFIG_SAH_LIB_AMXM

CONFIG_SAH_LIB_AMXM ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_AMXM \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN}-dev += "${INCLUDEDIR}/amxm/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
