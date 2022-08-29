

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to.git;protocol=https;nobranch=1"
SRCREV = "v0.2.5"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Odl xml conversion using xsl"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "amxo-xml-to"


DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libxslt"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxj"
RDEPENDS_${PN} += "libxslt"

FILES_${PN} += "${BINDIR}/${COMPONENT}"
FILES_${PN} += "/etc/amx/xsl/*.xsl"
FILES_${PN} += "/etc/amx/html/*"
FILES_${PN} += "/etc/amx/xml/default.conf"
