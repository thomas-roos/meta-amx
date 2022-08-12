

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amxb-inspect.git;protocol=https;nobranch=1"
SRCREV = "v1.2.0"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Ambiorix Backend inspector/validation tool"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "amxb-inspect"


DEPENDS += "libamxb"

RDEPENDS:${PN} += "libamxb"

FILES:${PN} += "${BINDIR}/${COMPONENT}"
