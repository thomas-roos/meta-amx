

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli.git;protocol=https;nobranch=1"
SRCREV = "v0.2.22"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Ambiorix interactive CLI"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "amx-cli"


DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxt"
DEPENDS += "libamxm"
DEPENDS += "libamxo"
DEPENDS += "libamxj"
DEPENDS += "libevent"
DEPENDS += "yajl"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxp"
RDEPENDS_${PN} += "libamxt"
RDEPENDS_${PN} += "libamxm"
RDEPENDS_${PN} += "libamxo"
RDEPENDS_${PN} += "libamxj"
RDEPENDS_${PN} += "libevent"
RDEPENDS_${PN} += "yajl"

FILES_${PN} += "${BINDIR}/${COMPONENT}"
FILES_${PN} += "/etc/amx/cli/amx-cli.conf"
FILES_${PN} += "/etc/amx/cli/amx-cli.init"
