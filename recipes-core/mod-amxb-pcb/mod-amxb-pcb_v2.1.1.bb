

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/modules/amxb_backends/amxb_pcb.git;protocol=https;nobranch=1"
SRCREV = "v2.1.1"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "PCB backend implementation for amxb"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE.SAH;md5=a0f6bf5b78959aa070b853b0ad21d9a2 \
                    file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf \
                    "

COMPONENT = "mod-amxb-pcb"

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libpcb"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxp"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "libamxb"
RDEPENDS_${PN} += "libpcb"

FILES_${PN} += "${BINDIR}/mods/amxb/${COMPONENT}.so"
