

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/greeter_app.git;protocol=https;nobranch=1"
SRCREV = "v1.0.3"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Simple standalone example greeter application build using the amx APIs"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "amx-greeter-app"



export CONFIG_SAH_AMX_GREETER_APP

CONFIG_SAH_AMX_GREETER_APP ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_AMX_GREETER_APP \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libamxb"
DEPENDS += "libamxrt"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxrt"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/etc/amx/greeter/greeter_defaults.odl"
FILES:${PN} += "/etc/amx/greeter/greeter_definition.odl"
FILES:${PN} += "/etc/amx/greeter/greeter_extra.odl"
FILES:${PN} += "/etc/amx/greeter/greeter.odl"
FILES:${PN} += "${BINDIR}/greeter"
