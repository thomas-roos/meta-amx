

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/applications/amxb-inspect.git;protocol=https;nobranch=1"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Ambiorix Backend inspector/validation tool"
LICENSE += "BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "amxb-inspect"


DEPENDS += "libamxb"

RDEPENDS:${PN} += "libamxb"

FILES:${PN} += "${BINDIR}/${COMPONENT}"
