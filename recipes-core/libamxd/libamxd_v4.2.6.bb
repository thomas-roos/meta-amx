

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd.git;protocol=https;nobranch=1"
SRCREV = "v4.2.6"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Data model C-API"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "libamxd"



export CONFIG_SAH_LIB_AMXD

CONFIG_SAH_LIB_AMXD ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_AMXD \
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

FILES:${PN}-dev += "${INCLUDEDIR}/amxd/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
