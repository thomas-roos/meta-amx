

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb.git;protocol=https;nobranch=1"
SRCREV = "v3.6.27"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "PCB backend implementation for amxb"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "mod-amxb-pcb"



export CONFIG_SAH_MOD_AMXB_PCB

CONFIG_SAH_MOD_AMXB_PCB ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_MOD_AMXB_PCB \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libamxa"
DEPENDS += "libpcb"
DEPENDS += "libusermngt"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libpcb"
RDEPENDS:${PN} += "libamxa"
RDEPENDS:${PN} += "libusermngt"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "${BINDIR}/mods/amxb/${COMPONENT}.so"
