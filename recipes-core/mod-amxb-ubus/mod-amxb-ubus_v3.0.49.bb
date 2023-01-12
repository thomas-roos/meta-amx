

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus.git;protocol=https;nobranch=1"
SRCREV = "v3.0.49"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Ubus Backend"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "mod-amxb-ubus"



export CONFIG_SAH_LIB_AMXB_UBUS

CONFIG_SAH_LIB_AMXB_UBUS ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_AMXB_UBUS \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxb"
DEPENDS += "libamxd"
DEPENDS += "ubus"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "ubus"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN}-dev += "${INCLUDEDIR}/amxb_be_ubus/*.h"
FILES:${PN} += "/usr/bin/mods/amxb/${COMPONENT}.so"
FILES:${PN} += "${LIBDIR}/libamxb_ubus${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/libamxb_ubus${SOLIBSDEV}"
FILES:${PN} += "${BINDIR}/forward_ubus_client.sh"
FILES:${PN} += "${BINDIR}/forward_ubus_server.sh"
