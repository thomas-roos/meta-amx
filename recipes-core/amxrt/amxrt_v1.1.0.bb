

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/applications/amxrt.git;protocol=https;nobranch=1"
SRCREV = "v1.1.0"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Data model runtime"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE.SAH;md5=a0f6bf5b78959aa070b853b0ad21d9a2 \
                    file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf \
                    "

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
