

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to.git;protocol=https;nobranch=1"
SRCREV = "v0.2.7"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Odl xml conversion using xsl"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "amxo-xml-to"



export CONFIG_SAH_SERVICES_AMXO_XML_TO

CONFIG_SAH_SERVICES_AMXO_XML_TO ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_SERVICES_AMXO_XML_TO \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libxslt"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libxslt"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "${BINDIR}/${COMPONENT}"
FILES:${PN} += "/etc/amx/xsl/*.xsl"
FILES:${PN} += "/etc/amx/html/*"
FILES:${PN} += "/etc/amx/xml/default.conf"
