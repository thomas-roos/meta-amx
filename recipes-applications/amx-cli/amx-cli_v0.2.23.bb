

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli.git;protocol=https;nobranch=1"
SRCREV = "v0.2.23"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Ambiorix interactive CLI"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "amx-cli"



export CONFIG_SAH_SERVICES_AMX-CLI

CONFIG_SAH_SERVICES_AMX-CLI ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_SERVICES_AMX-CLI \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxt"
DEPENDS += "libamxm"
DEPENDS += "libamxo"
DEPENDS += "libamxj"
DEPENDS += "libevent"
DEPENDS += "yajl"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxt"
RDEPENDS:${PN} += "libamxm"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libevent"
RDEPENDS:${PN} += "yajl"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "${BINDIR}/${COMPONENT}"
FILES:${PN} += "/etc/amx/cli/amx-cli.conf"
FILES:${PN} += "/etc/amx/cli/amx-cli.init"
