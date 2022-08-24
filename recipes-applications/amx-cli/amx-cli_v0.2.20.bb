

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli.git;protocol=https;nobranch=1"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Ambiorix interactive CLI"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "amx-cli"


DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxt"
DEPENDS += "libamxm"
DEPENDS += "libamxo"
DEPENDS += "libamxj"
DEPENDS += "libevent"
DEPENDS += "yajl"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxt"
RDEPENDS:${PN} += "libamxm"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libevent"
RDEPENDS:${PN} += "yajl"

FILES:${PN} += "${BINDIR}/${COMPONENT}"
FILES:${PN} += "/etc/amx/cli/amx-cli.conf"
FILES:${PN} += "/etc/amx/cli/amx-cli.init"
