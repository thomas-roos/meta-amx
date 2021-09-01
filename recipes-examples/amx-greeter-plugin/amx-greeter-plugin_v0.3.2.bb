

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/examples/datamodel/greeter_plugin.git;protocol=https;nobranch=1"
SRCREV = "v0.3.2"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Simple example application that creates a data model using the Ambiorix framework"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE.SAH;md5=a0f6bf5b78959aa070b853b0ad21d9a2 \
                    file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf \
                    "

COMPONENT = "amx-greeter-plugin"

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxp"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "libamxo"

FILES_${PN} += "/etc/amx/greeter/greeter_defaults.odl"
FILES_${PN} += "/etc/amx/greeter/greeter_definition.odl"
FILES_${PN} += "/etc/amx/greeter/greeter_extra.odl"
FILES_${PN} += "/etc/amx/greeter/greeter.odl"
FILES_${PN} += "/usr/bin/greeter.odl"
FILES_${PN} += "/usr/lib/amx/greeter/greeter.so"
FILES_${PN} += "${BINDIR}/greeter"
