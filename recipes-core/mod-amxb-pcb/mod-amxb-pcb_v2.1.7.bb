

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/modules/amxb_backends/amxb_pcb.git;protocol=https;nobranch=1"
SRCREV = "v2.1.7"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "PCB backend implementation for amxb"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

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
