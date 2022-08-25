

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/acl-manager.git;protocol=https;nobranch=1"
SRCREV = ""

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "The ACL manager will monitor the ACL directory and merge ACL files together to create a single master ACL file per role."
LICENSE += "SAH"

COMPONENT = "acl-manager"



export CONFIG_SAH_SERVICES_ACL-MANAGER

CONFIG_SAH_SERVICES_ACL-MANAGER ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_SERVICES_ACL-MANAGER \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libamxa"
DEPENDS += "libsahtrace"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxa"
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

FILES:${PN} += "/usr/lib/amx/${COMPONENT}/${COMPONENT}.so"
FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}.odl"
FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}_definition.odl"
FILES:${PN} += "${ACLDIR}/operator/${COMPONENT}.json"
FILES:${PN} += "${ACLDIR}/guest/${COMPONENT}.json"
FILES:${PN} += "${BINDIR}/${COMPONENT}"
FILES:${PN} += "${INITDIR}/${COMPONENT}"
FILES:${PN} += "${LIBDIR}/debuginfo/D10${COMPONENT}"
