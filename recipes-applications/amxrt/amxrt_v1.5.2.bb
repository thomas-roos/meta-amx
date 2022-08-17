

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt.git;protocol=https;nobranch=1"
SRCREV = "v1.5.2"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Data model runtime"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "amxrt"


DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libamxp"
DEPENDS += "libamxb"
DEPENDS += "libamxo"
DEPENDS += "libevent"
DEPENDS += "yajl"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxj"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "libamxp"
RDEPENDS_${PN} += "libamxb"
RDEPENDS_${PN} += "libamxo"
RDEPENDS_${PN} += "libevent"
RDEPENDS_${PN} += "yajl"

FILES_${PN} += "${BINDIR}/${COMPONENT}"
