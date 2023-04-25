

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs.git;protocol=https;nobranch=1"
SRCREV = "v0.1.59"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Data model synchronization C-API"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "libamxs"



export CONFIG_SAH_LIB_AMXS

CONFIG_SAH_LIB_AMXS ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_AMXS \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxb"
DEPENDS += "libamxd"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxd"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN}-dev += "${INCLUDEDIR}/amxs/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
