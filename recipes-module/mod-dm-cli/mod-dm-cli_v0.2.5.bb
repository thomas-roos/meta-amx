

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-dm-cli.git;protocol=https;nobranch=1"
SRCREV = "v0.2.5"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Data Model Command Line Interface"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "mod-dm-cli"



export CONFIG_SAH_MOD_DM_CLI

CONFIG_SAH_MOD_DM_CLI ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_MOD_DM_CLI \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxt"
DEPENDS += "libamxm"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libamxo"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxt"
RDEPENDS:${PN} += "libamxm"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "amx-cli"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/usr/lib/amx/amx-cli/${COMPONENT}.so"
