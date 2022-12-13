

SRC_URI = "git://gitlab.com/prpl-foundation/components/core/modules/mod-dmext.git;protocol=https;nobranch=1"
SRCREV = "v0.4.1"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Data model extension module"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "mod-dmext"



export CONFIG_SAH_MOD_DMEXT

CONFIG_SAH_MOD_DMEXT ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_MOD_DMEXT \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libamxo"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/usr/lib/amx/modules/${COMPONENT}.so"
