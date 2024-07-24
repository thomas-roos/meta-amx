

SRC_URI = "git://gitlab.com/prpl-foundation/lcm/samples/lcmsampleapp.git;protocol=https;nobranch=1"
SRCREV = "v0.2.0"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Simple example application that creates a data model using the Ambiorix framework to manipulate in LCM examples"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=cd9db409406fd4c7234d852479547016"

COMPONENT = "lcmsampleapp"



export CONFIG_SAH_LCM_SAMPLE_APP

CONFIG_SAH_LCM_SAMPLE_APP ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LCM_SAMPLE_APP \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libsahtrace"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libsahtrace"
RDEPENDS:${PN} += "amxrt"

inherit update-rc.d
INITSCRIPT_NAME = "${COMPONENT}"

INITSCRIPT_PARAMS = "start 99 2 3 4 5 . stop 1 0 1 6 ."

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}_defaults.odl"
FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}_definition.odl"
FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}.odl"
FILES:${PN} += "/usr/lib/amx/${COMPONENT}/${COMPONENT}.so"
FILES:${PN} += "${BINDIR}/${COMPONENT}"
FILES:${PN} += "${INITDIR}/${COMPONENT}"
FILES:${PN} += "${LIBDIR}/debuginfo/D99${COMPONENT}"
