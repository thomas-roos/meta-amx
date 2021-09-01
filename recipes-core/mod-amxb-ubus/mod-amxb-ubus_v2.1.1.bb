

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/modules/amxb_backends/amxb_ubus.git;protocol=https;nobranch=1"
SRCREV = "v2.1.1"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Ubus Backend"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE.SAH;md5=a0f6bf5b78959aa070b853b0ad21d9a2 \
                    file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf \
                    "

COMPONENT = "mod-amxb-ubus"

DEPENDS += "libamxc"
DEPENDS += "libamxb"
DEPENDS += "libamxd"
DEPENDS += "ubus"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxb"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "ubus"

FILES_${PN}-dev += "${INCLUDEDIR}/amxb_be_ubus/*.h"
FILES_${PN} += "/usr/bin/mods/amxb/${COMPONENT}.so"
FILES_${PN} += "${LIBDIR}/libamxb_ubus${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/libamxb_ubus${SOLIBSDEV}"
FILES_${PN} += "${BINDIR}/forward_ubus_client.sh"
FILES_${PN} += "${BINDIR}/forward_ubus_server.sh"
