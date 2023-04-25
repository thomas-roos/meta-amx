

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg.git;protocol=https;nobranch=1"
SRCREV = "v1.2.12"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Object Definition Language Compiler/Generator"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "amxo-cg"



export CONFIG_SAH_SERVICES_AMXO_CG

CONFIG_SAH_SERVICES_AMXO_CG ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_SERVICES_AMXO_CG \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libxml2"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libxml2"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "${BINDIR}/${COMPONENT}"
