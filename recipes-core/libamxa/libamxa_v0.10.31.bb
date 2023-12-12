

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa.git;protocol=https;nobranch=1"
SRCREV = "v0.10.31"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Access control verification"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "libamxa"



export CONFIG_SAH_LIB_AMXA

CONFIG_SAH_LIB_AMXA ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_AMXA \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libamxd"
DEPENDS += "libamxb"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN}-dev += "${INCLUDEDIR}/amxa/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
