

SRC_URI = "git://gitlab.com/prpl-foundation/components/core/modules/mod-sahtrace.git;protocol=https;nobranch=1"
SRCREV = "v1.0.5"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Module for sahtrace logging"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "mod-sahtrace"



export CONFIG_SAH_MOD_SAHTRACE

CONFIG_SAH_MOD_SAHTRACE ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_MOD_SAHTRACE \
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

do_install() {
        oe_runmake install
}

FILES:${PN} += "/usr/lib/amx/modules/${COMPONENT}.so"
FILES:${PN} += "/etc/amx/modules/mod_sahtrace.odl"
