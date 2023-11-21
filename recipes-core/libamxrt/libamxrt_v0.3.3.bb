

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt.git;protocol=https;nobranch=1"
SRCREV = "v0.3.3"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Ambiorix Run Time API"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "libamxrt"



export CONFIG_SAH_LIB_AMXRT
export CONFIG_SAH_AMXRT_RWDATAPATH

CONFIG_SAH_LIB_AMXRT ??= "y"
CONFIG_SAH_AMXRT_RWDATAPATH ??= "/etc/config"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_AMXRT \
                CONFIG_SAH_AMXRT_RWDATAPATH \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libamxb"
DEPENDS += "libevent"
DEPENDS += "libcap-ng"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libevent"
RDEPENDS:${PN} += "libcap-ng"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN}-dev += "${INCLUDEDIR}/amxrt/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
