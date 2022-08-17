

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/localagent_threshold.git;protocol=https;nobranch=1"
SRCREV = "v0.2.20"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Example of an implementation of USP Device:2.13 LocalAgent.Threshold."
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "amx-tr181-localagent-threshold"


DEPENDS += "libamxc"
DEPENDS += "libamxb"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libevent"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libevent"

FILES:${PN} += "/etc/amx/la_threshold/la_threshold_defaults.odl"
FILES:${PN} += "/etc/amx/la_threshold/la_threshold_definition.odl"
FILES:${PN} += "/etc/amx/la_threshold/la_threshold.odl"
FILES:${PN} += "${BINDIR}/la_threshold.odl"
FILES:${PN} += "/usr/lib/amx/la_threshold/la_threshold.so"
FILES:${PN} += "${BINDIR}/la_threshold"
