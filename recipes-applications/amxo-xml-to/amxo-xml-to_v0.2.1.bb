

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to.git;protocol=https;nobranch=1"
SRCREV = ""
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Odl xml conversion using xsl"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "amxo-xml-to"


DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libxslt"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libxslt"

FILES:${PN} += "${BINDIR}/${COMPONENT}"
FILES:${PN} += "/etc/amx/xsl/*.xsl"
FILES:${PN} += "/etc/amx/html/*"
FILES:${PN} += "/etc/amx/xml/default.conf"
