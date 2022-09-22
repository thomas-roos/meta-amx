

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli.git;protocol=https;nobranch=1"
SRCREV = "v0.7.7"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Bus Agnostic Command Line Interface"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "mod-ba-cli"


DEPENDS += "libamxc"
DEPENDS += "libamxt"
DEPENDS += "libamxm"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libamxo"
DEPENDS += "libamxa"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxt"
RDEPENDS_${PN} += "libamxm"
RDEPENDS_${PN} += "libamxp"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "libamxb"
RDEPENDS_${PN} += "libamxo"
RDEPENDS_${PN} += "libamxa"
RDEPENDS_${PN} += "amx-cli"

FILES_${PN} += "/usr/lib/amx/amx-cli/${COMPONENT}.so"
FILES_${PN} += "/etc/amx/cli/ba-cli.init"
FILES_${PN} += "/etc/amx/cli/ba-cli.conf"
FILES_${PN} += "${BINDIR}/ba-cli"
FILES_${PN} += "/etc/amx/cli/ubus-cli.init"
FILES_${PN} += "/etc/amx/cli/ubus-cli.conf"
FILES_${PN} += "${BINDIR}/ubus-cli"
FILES_${PN} += "/etc/amx/cli/pcb-cli.init"
FILES_${PN} += "/etc/amx/cli/pcb-cli.conf"
FILES_${PN} += "${BINDIR}/pcb-cli"
