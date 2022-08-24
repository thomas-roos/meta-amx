

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt.git;protocol=https;nobranch=1"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Data model runtime"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "amxrt"


DEPENDS += "libamxc"
DEPENDS += "libamxd"
DEPENDS += "libamxp"
DEPENDS += "libamxb"
DEPENDS += "libamxo"
DEPENDS += "libevent"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libevent"

FILES:${PN} += "${BINDIR}/${COMPONENT}"
