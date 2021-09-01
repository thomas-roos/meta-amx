

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/applications/amxo-cg.git;protocol=https;nobranch=1"
SRCREV = "v1.1.6"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Object Definition Language Compiler/Generator"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE.SAH;md5=a0f6bf5b78959aa070b853b0ad21d9a2 \
                    file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf \
                    "

COMPONENT = "amxo-cg"

DEPENDS += "libamxc"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libxml2"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "libamxo"
RDEPENDS_${PN} += "libxml2"

FILES_${PN} += "${BINDIR}/${COMPONENT}"
