

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxj.git;protocol=https;nobranch=1"
SRCREV = "v1.0.2"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "JSON parser & generator using yajl and libamxc variants"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=cd9db409406fd4c7234d852479547016"

COMPONENT = "libamxj"



export CONFIG_SAH_LIB_AMXJ

CONFIG_SAH_LIB_AMXJ ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_AMXJ \
                "

DEPENDS += "libamxc"
DEPENDS += "yajl"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "yajl"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN}-dev += "${INCLUDEDIR}/amxj/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
