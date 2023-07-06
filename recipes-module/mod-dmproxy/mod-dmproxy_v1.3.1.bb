

SRC_URI = "git://gitlab.com/prpl-foundation/components/core/modules/mod-dmproxy.git;protocol=https;nobranch=1"
SRCREV = "v1.3.1"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Data model object proxy"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "mod-dmproxy"



export CONFIG_SAH_MOD_DMPROXY

CONFIG_SAH_MOD_DMPROXY ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_MOD_DMPROXY \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libamxb"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxb"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/usr/lib/amx/modules/${COMPONENT}.so"
