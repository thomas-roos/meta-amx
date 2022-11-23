

S = "${WORKDIR}/git"

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli.git;protocol=https;nobranch=1"
SRCREV = "v0.7.10"
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

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxt"
RDEPENDS:${PN} += "libamxm"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxa"
RDEPENDS:${PN} += "amx-cli"

S = "${WORKDIR}/git"
FILES:${PN} += "/usr/lib/amx/amx-cli/${COMPONENT}.so"
FILES:${PN} += "/etc/amx/cli/ba-cli.init"
FILES:${PN} += "/etc/amx/cli/ba-cli.conf"
FILES:${PN} += "${BINDIR}/ba-cli"
FILES:${PN} += "/etc/amx/cli/ubus-cli.init"
FILES:${PN} += "/etc/amx/cli/ubus-cli.conf"
FILES:${PN} += "${BINDIR}/ubus-cli"
FILES:${PN} += "/etc/amx/cli/pcb-cli.init"
FILES:${PN} += "/etc/amx/cli/pcb-cli.conf"
FILES:${PN} += "${BINDIR}/pcb-cli"
