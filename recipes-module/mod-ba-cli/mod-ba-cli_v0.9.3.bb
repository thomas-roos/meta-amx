

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli.git;protocol=https;nobranch=1"
SRCREV = "v0.9.3"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Bus Agnostic Command Line Interface"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "mod-ba-cli"



export CONFIG_SAH_MOD_BA_CLI
export CONFIG_SAH_MOD_BA_CLI_INSTALL_UBUS_CLI
export CONFIG_SAH_MOD_BA_CLI_INSTALL_PCB_CLI

CONFIG_SAH_MOD_BA_CLI ??= "y"
CONFIG_SAH_MOD_BA_CLI_INSTALL_UBUS_CLI ??= "y"
CONFIG_SAH_MOD_BA_CLI_INSTALL_PCB_CLI ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_MOD_BA_CLI \
                CONFIG_SAH_MOD_BA_CLI_INSTALL_UBUS_CLI \
                CONFIG_SAH_MOD_BA_CLI_INSTALL_PCB_CLI \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxt"
DEPENDS += "libamxm"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libamxa"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxt"
RDEPENDS:${PN} += "libamxm"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxa"
RDEPENDS:${PN} += "amx-cli"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

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
