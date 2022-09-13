

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/greeter_app.git;protocol=https;nobranch=1"
SRCREV = "v0.1.16"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Simple standalone example greeter application build using the amx APIs"
LICENSE += "BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

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
