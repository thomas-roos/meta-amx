

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/localagent_threshold.git;protocol=https;nobranch=1"
SRCREV = "v0.2.19"
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

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxb"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "libamxo"
RDEPENDS_${PN} += "libevent"

FILES_${PN} += "/etc/amx/la_threshold/la_threshold_defaults.odl"
FILES_${PN} += "/etc/amx/la_threshold/la_threshold_definition.odl"
FILES_${PN} += "/etc/amx/la_threshold/la_threshold.odl"
FILES_${PN} += "${BINDIR}/la_threshold.odl"
FILES_${PN} += "/usr/lib/amx/la_threshold/la_threshold.so"
FILES_${PN} += "${BINDIR}/la_threshold"
