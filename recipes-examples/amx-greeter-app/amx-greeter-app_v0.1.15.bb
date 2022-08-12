

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/greeter_app.git;protocol=https;nobranch=1"
SRCREV = "v0.1.15"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Simple standalone example greeter application build using the amx APIs"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "amx-greeter-app"


DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libamxb"
DEPENDS += "libevent"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libevent"

FILES:${PN} += "/etc/amx/greeter/greeter_defaults.odl"
FILES:${PN} += "/etc/amx/greeter/greeter_definition.odl"
FILES:${PN} += "/etc/amx/greeter/greeter_extra.odl"
FILES:${PN} += "/etc/amx/greeter/greeter.odl"
FILES:${PN} += "${BINDIR}/greeter.odl"
FILES:${PN} += "${BINDIR}/greeter"
