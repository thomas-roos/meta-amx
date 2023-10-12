

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amxb-inspect.git;protocol=https;nobranch=1"
SRCREV = "v1.2.1"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Ambiorix Backend inspector/validation tool"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "amxb-inspect"



export CONFIG_SAH_SERVICES_AMXB_INSPECT

CONFIG_SAH_SERVICES_AMXB_INSPECT ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_SERVICES_AMXB_INSPECT \
                "

DEPENDS += "libamxb"

RDEPENDS:${PN} += "libamxb"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "${BINDIR}/${COMPONENT}"
