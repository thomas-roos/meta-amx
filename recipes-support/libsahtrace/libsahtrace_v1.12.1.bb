

SRC_URI = "git://gitlab.com/prpl-foundation/components/core/libraries/libsahtrace.git;protocol=https;nobranch=1"
SRCREV = "v1.12.1"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Small and flexible library to enable tracing and logging"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "libsahtrace"



export CONFIG_SAH_LIB_SAHTRACE
export CONFIG_SAH_TRACES_ENABLED
export CONFIG_SAH_TRACES_LEVEL
export CONFIG_SAH_TRACES_SYSLOG_CONSOLE
export CONFIG_SAH_TRACE_NO_COLORS

CONFIG_SAH_LIB_SAHTRACE ??= "y"
CONFIG_SAH_TRACES_ENABLED ??= "y"
CONFIG_SAH_TRACES_LEVEL ??= "500"
CONFIG_SAH_TRACES_SYSLOG_CONSOLE ??= "y"
SAH_TRACE_NO_COLORS ??= "y"
SAH_TRACE_COLORS ??= "n"
SAH_TRACE_COLORS_SIMPLE ??= "n"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_SAHTRACE \
                CONFIG_SAH_TRACES_ENABLED \
                CONFIG_SAH_TRACES_LEVEL \
                CONFIG_SAH_TRACES_SYSLOG_CONSOLE \
                SAH_TRACE_NO_COLORS \
                SAH_TRACE_COLORS \
                SAH_TRACE_COLORS_SIMPLE \
                "



# EXTRA_OEMAKE += "DEST=${D} \
#                  PREFIX=${prefix} \
#                  LIBDIR=${libdir} \
#                  BINDIR=${bindir} \
#                  INCLUDEDIR=${includedir} \
#                  "

FILES:${PN}-dev += "${INCLUDEDIR}/debug/*.h"
FILES:${PN} += "/lib/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "/lib/${COMPONENT}${SOLIBSDEV}"
FILES:${PN}-dev += "${PKG_CONFIG_LIBDIR}/sahtrace.pc"

BBCLASSEXTEND += "native"