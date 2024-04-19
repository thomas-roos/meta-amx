

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/amxlab/tui/libraries/libamxtui.git;protocol=https;nobranch=1"
SRCREV = "v0.1.7"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Libamxtui is a library that provides terminal user interface widgets based on ncurses."
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=cd9db409406fd4c7234d852479547016"

COMPONENT = "libamxtui"



export CONFIG_SAH_LIB_AMXTUI

CONFIG_SAH_LIB_AMXTUI ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_AMXTUI \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxt"
DEPENDS += "libamxp"
DEPENDS += "ncurses"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxt"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "ncurses"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN}-dev += "${INCLUDEDIR}/amxtui/*.h"
FILES:${PN}-dev += "${INCLUDEDIR}/amxtui/ctrl/*.h"
FILES:${PN}-staticdev += "${LIBDIR}/${COMPONENT}.a"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
