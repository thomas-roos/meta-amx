

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Simple example application that creates a data model using the Ambiorix framework to manipulate in LCM examples"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "LCMSampleApp"

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

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/etc/amx/LCMSampleApp/defaults.odl"
FILES:${PN} += "/etc/amx/LCMSampleApp/definition.odl"
FILES:${PN} += "/etc/amx/LCMSampleApp/LCMSampleApp.odl"
FILES:${PN} += "/usr/bin/LCMSampleApp.odl"
FILES:${PN} += "/usr/lib/amx/LCMSampleApp/LCMSampleApp.so"
FILES:${PN} += "${BINDIR}/LCMSampleApp"
FILES:${PN} += "/etc/init.d/LCMSampleApp"
