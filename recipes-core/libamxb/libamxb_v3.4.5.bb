

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/libraries/libamxb.git;protocol=https;nobranch=1"
SRCREV = "v3.4.5"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Bus agnostic C API (mediator)"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE.SAH;md5=a0f6bf5b78959aa070b853b0ad21d9a2 \
                    file://LICENSE.BSD;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf \
                    "

COMPONENT = "libamxb"


DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "uriparser"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxp"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "uriparser"

FILES_${PN}-dev += "${INCLUDEDIR}/amxb/*.h"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
