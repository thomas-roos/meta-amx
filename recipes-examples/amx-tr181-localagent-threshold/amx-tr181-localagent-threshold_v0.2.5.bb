DESCRIPTION = "xample implementation of USP Device:2.13 LocalAgent.Threshold"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/datamodel/localagent_threshold"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxj libamxb libamxd libamxo libevent"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/datamodel/localagent_threshold.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} VERSION_PREFIX="

do_install() {
        oe_runmake install
}

FILES_${PN} += "/usr/lib/amx/la_threshold/la_threshold.so"
