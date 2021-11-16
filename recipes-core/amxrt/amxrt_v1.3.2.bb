

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt.git;protocol=https;nobranch=1"
SRCREV = "v1.3.2"
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

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "libamxp"
RDEPENDS_${PN} += "libamxb"
RDEPENDS_${PN} += "libamxo"
RDEPENDS_${PN} += "libevent"

FILES_${PN} += "${BINDIR}/${COMPONENT}"
