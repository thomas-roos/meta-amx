

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt.git;protocol=https;nobranch=1"
SRCREV = "v1.5.12"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Data model runtime"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "amxrt"



export CONFIG_SAH_SERVICES_AMXRT
export CONFIG_SAH_AMXRT_RWDATAPATH

CONFIG_SAH_SERVICES_AMXRT ??= "y"
CONFIG_SAH_AMXRT_RWDATAPATH ??= "/etc/config"

SAH_CONFIG += " \
                CONFIG_SAH_SERVICES_AMXRT \
                CONFIG_SAH_AMXRT_RWDATAPATH \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libamxp"
DEPENDS += "libamxb"
DEPENDS += "libamxo"
DEPENDS += "libevent"
DEPENDS += "yajl"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libevent"
RDEPENDS:${PN} += "yajl"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

do_install() {
        oe_runmake install
}

FILES:${PN} += "${BINDIR}/${COMPONENT}"
