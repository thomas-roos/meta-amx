

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/examples/datamodel/greeter_plugin.git;protocol=https;nobranch=1"
SRCREV = "v0.3.2"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Simple example application that creates a data model using the Ambiorix framework"
LICENSE += "BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "amx-greeter-plugin"



DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"

FILES:${PN} += "/etc/amx/greeter/greeter_defaults.odl"
FILES:${PN} += "/etc/amx/greeter/greeter_definition.odl"
FILES:${PN} += "/etc/amx/greeter/greeter_extra.odl"
FILES:${PN} += "/etc/amx/greeter/greeter.odl"
FILES:${PN} += "/usr/bin/greeter.odl"
FILES:${PN} += "/usr/lib/amx/greeter/greeter.so"
FILES:${PN} += "${BINDIR}/greeter"
