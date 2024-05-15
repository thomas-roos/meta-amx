

SRC_URI = "git://gitlab.softathome.com/ext_prpl/components/libamx-mqtt-client.git;protocol=https;nobranch=1"
SRCREV = "v0.2.4"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = ""
LICENSE += "SAH"
LIC_FILES_CHKSUM += "file://LICENSE;md5=87f936f5d9d60bf1e6b689253d476202"

COMPONENT = "libamx-mqtt-client"



export CONFIG_SAH_LIB_AMX_MQTT-CLIENT

CONFIG_SAH_LIB_AMX_MQTT-CLIENT ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_AMX_MQTT-CLIENT \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libamxb"
DEPENDS += "libamxj"
DEPENDS += "libsahtrace"
DEPENDS += "libimtp"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libsahtrace"
RDEPENDS:${PN} += "libimtp"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN}-dev += "${INCLUDEDIR}/amx_mqtt_client/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
