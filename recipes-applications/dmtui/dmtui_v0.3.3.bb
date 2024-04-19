

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/amxlab/tui/applications/dmtui.git;protocol=https;nobranch=1"
SRCREV = "v0.3.3"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Simple example application that creates a data model using the Ambiorix framework"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=cd9db409406fd4c7234d852479547016"

COMPONENT = "dmtui"



export CONFIG_SAH_SERVICES_DMTUI

CONFIG_SAH_SERVICES_DMTUI ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_SERVICES_DMTUI \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxt"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libamxb"
DEPENDS += "libamxtui"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxt"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxtui"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/etc/amx/dmtui/dmtui.odl"
FILES:${PN} += "/usr/lib/amx/dmtui/dmtui.so"
FILES:${PN} += "${BINDIR}/dmtui"
