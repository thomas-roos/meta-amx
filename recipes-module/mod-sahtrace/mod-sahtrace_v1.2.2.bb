

SRC_URI = "git://gitlab.com/prpl-foundation/components/core/modules/mod-sahtrace.git;protocol=https;nobranch=1"
SRCREV = "v1.2.2"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Module for sahtrace logging"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=cd9db409406fd4c7234d852479547016"

COMPONENT = "mod-sahtrace"



export CONFIG_SAH_MOD_SAHTRACE
export CONFIG_SAH_MOD_SAHTRACE_DEFAULT_LOG_LEVEL
export CONFIG_SAH_MOD_SAHTRACE_DEFAULT_TRACE_ZONE_LEVEL

CONFIG_SAH_MOD_SAHTRACE ??= "y"
CONFIG_SAH_MOD_SAHTRACE_DEFAULT_LOG_LEVEL ??= "${@ "200" if ( d.getVar("CONFIG_SAH_MOD_SAHTRACE") != "n") else "n" }"
CONFIG_SAH_MOD_SAHTRACE_DEFAULT_TRACE_ZONE_LEVEL ??= "${@ "200" if ( d.getVar("CONFIG_SAH_MOD_SAHTRACE") != "n") else "n" }"

SAH_CONFIG += " \
                CONFIG_SAH_MOD_SAHTRACE \
                CONFIG_SAH_MOD_SAHTRACE_DEFAULT_LOG_LEVEL \
                CONFIG_SAH_MOD_SAHTRACE_DEFAULT_TRACE_ZONE_LEVEL \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libamxj"
DEPENDS += "libsahtrace"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libsahtrace"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/usr/lib/amx/modules/${COMPONENT}.so"
FILES:${PN} += "/etc/amx/modules/mod_sahtrace.odl"
FILES:${PN} += "/etc/amx/modules/global_trace.odl"
