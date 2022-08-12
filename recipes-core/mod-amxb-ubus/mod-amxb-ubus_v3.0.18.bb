

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus.git;protocol=https;nobranch=1"
SRCREV = "v3.0.18"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Ubus Backend"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "mod-amxb-ubus"


DEPENDS += "libamxc"
DEPENDS += "libamxb"
DEPENDS += "libamxd"
DEPENDS += "ubus"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "ubus"

FILES:${PN}-dev += "${INCLUDEDIR}/amxb_be_ubus/*.h"
FILES:${PN} += "/usr/bin/mods/amxb/${COMPONENT}.so"
FILES:${PN} += "${LIBDIR}/libamxb_ubus${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/libamxb_ubus${SOLIBSDEV}"
FILES:${PN} += "${BINDIR}/forward_ubus_client.sh"
FILES:${PN} += "${BINDIR}/forward_ubus_server.sh"
