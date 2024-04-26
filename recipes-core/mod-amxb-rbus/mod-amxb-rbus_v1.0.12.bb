

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_rbus2.git;protocol=https;nobranch=1"
SRCREV = "v1.0.12"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Rbus Backend"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=cd9db409406fd4c7234d852479547016"

COMPONENT = "mod-amxb-rbus"



export CONFIG_SAH_LIB_AMXB_RBUS

CONFIG_SAH_LIB_AMXB_RBUS ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_AMXB_RBUS \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxb"
DEPENDS += "libamxd"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxd"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/usr/bin/mods/amxb/${COMPONENT}.so"
FILES:${PN} += "${LIBDIR}/libamxb_rbus${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/libamxb_rbus${SOLIBSDEV}"
