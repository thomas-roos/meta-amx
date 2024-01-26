

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb.git;protocol=https;nobranch=1"
SRCREV = "v4.8.0"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Bus agnostic C API (mediator)"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=cd9db409406fd4c7234d852479547016"

COMPONENT = "libamxb"



export CONFIG_SAH_LIB_AMXB

CONFIG_SAH_LIB_AMXB ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_AMXB \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "uriparser"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "uriparser"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN}-dev += "${INCLUDEDIR}/amxb/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
