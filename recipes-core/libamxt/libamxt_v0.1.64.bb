

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt.git;protocol=https;nobranch=1"
SRCREV = "v0.1.64"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Common patterns implementation"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "libamxt"



export CONFIG_SAH_LIB_AMXT

CONFIG_SAH_LIB_AMXT ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_AMXT \
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

FILES:${PN}-dev += "${INCLUDEDIR}/amxt/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
