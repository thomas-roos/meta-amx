

SRC_URI = "git://gitlab.com/prpl-foundation/components/core/libraries/libdhcpoptions.git;protocol=https;nobranch=1"
SRCREV = "v0.6.0"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Library to parse and evaluate the binary data of DHCP options"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "libdhcpoptions"



export CONFIG_SAH_AMX_TR181_LIB_DHCPOPTIONS

CONFIG_SAH_AMX_TR181_LIB_DHCPOPTIONS ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_AMX_TR181_LIB_DHCPOPTIONS \
                "

DEPENDS += "libamxc"

RDEPENDS:${PN} += "libamxc"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN}-dev += "${INCLUDEDIR}/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
