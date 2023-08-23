

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt.git;protocol=https;nobranch=1"
SRCREV = "v2.1.0"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Data model runtime"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "amxrt"



export CONFIG_SAH_SERVICES_AMXRT

CONFIG_SAH_SERVICES_AMXRT ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_SERVICES_AMXRT \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libamxb"
DEPENDS += "libevent"
DEPENDS += "libcap-ng"
DEPENDS += "libamxrt"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libevent"
RDEPENDS:${PN} += "libcap-ng"
RDEPENDS:${PN} += "libamxrt"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "${BINDIR}/${COMPONENT}"
