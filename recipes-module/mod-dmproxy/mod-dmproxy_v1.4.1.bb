

SRC_URI = "git://gitlab.com/prpl-foundation/components/core/modules/mod-dmproxy.git;protocol=https;nobranch=1"
SRCREV = "v1.4.1"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Data model object proxy"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=cd9db409406fd4c7234d852479547016"

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
DEPENDS += "libsahtrace"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libsahtrace"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/usr/lib/amx/modules/${COMPONENT}.so"
