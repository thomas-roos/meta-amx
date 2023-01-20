

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/greeter_plugin.git;protocol=https;nobranch=1"
SRCREV = "v0.4.4"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Simple example application that creates a data model using the Ambiorix framework"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "amx-greeter-plugin"



export CONFIG_SAH_AMX_GREETER_PLUGIN

CONFIG_SAH_AMX_GREETER_PLUGIN ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_AMX_GREETER_PLUGIN \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/etc/amx/greeter/greeter_defaults.odl"
FILES:${PN} += "/etc/amx/greeter/greeter_definition.odl"
FILES:${PN} += "/etc/amx/greeter/greeter_extra.odl"
FILES:${PN} += "/etc/amx/greeter/greeter.odl"
FILES:${PN} += "/usr/bin/greeter.odl"
FILES:${PN} += "/usr/lib/amx/greeter/greeter.so"
FILES:${PN} += "${BINDIR}/greeter"
