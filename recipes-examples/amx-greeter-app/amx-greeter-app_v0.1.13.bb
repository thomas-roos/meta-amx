

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/examples/datamodel/greeter_app.git;protocol=https;nobranch=1"
SRCREV = "v0.1.13"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Simple standalone example greeter application build using the amx APIs"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE.SAH;md5=a0f6bf5b78959aa070b853b0ad21d9a2 \
                    file://LICENSE.BSD;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf \
                    "

COMPONENT = "amx-greeter-app"



DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libamxb"
DEPENDS += "libevent"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxp"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "libamxo"
RDEPENDS_${PN} += "libamxb"
RDEPENDS_${PN} += "libevent"

FILES_${PN} += "/etc/amx/greeter/greeter_defaults.odl"
FILES_${PN} += "/etc/amx/greeter/greeter_definition.odl"
FILES_${PN} += "/etc/amx/greeter/greeter_extra.odl"
FILES_${PN} += "/etc/amx/greeter/greeter.odl"
FILES_${PN} += "${BINDIR}/greeter.odl"
FILES_${PN} += "${BINDIR}/greeter"
