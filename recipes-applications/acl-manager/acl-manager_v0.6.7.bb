

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/acl-manager.git;protocol=https;nobranch=1"
SRCREV = "v0.6.7"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "The ACL manager monitors ACL directory and merges ACL files."
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=cd9db409406fd4c7234d852479547016"

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

inherit update-rc.d
INITSCRIPT_NAME = "${COMPONENT}"

INITSCRIPT_PARAMS = "start 16 2 3 4 5 . stop 16 0 1 6 ."

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/usr/lib/amx/${COMPONENT}/${COMPONENT}.so"
FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}.odl"
FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}_definition.odl"
FILES:${PN} += "${ACLDIR}/operator/${COMPONENT}.json"
FILES:${PN} += "${BINDIR}/${COMPONENT}"
FILES:${PN} += "${INITDIR}/${COMPONENT}"
FILES:${PN} += "${LIBDIR}/debuginfo/D16${COMPONENT}"
