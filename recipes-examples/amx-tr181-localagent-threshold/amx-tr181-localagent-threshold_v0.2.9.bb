DESCRIPTION = "xample implementation of USP Device:2.13 LocalAgent.Threshold"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/datamodel/localagent_threshold"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "examples"
DEPENDS = "libamxc libamxj libamxb libamxd libamxo libevent"

SOLIBS = ".so"
SOLIBSDEV = ".so.*"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/datamodel/localagent_threshold.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} VERSION_PREFIX="

do_install() {
        oe_runmake install
}

RDEPENDS_${PN} = " \
                 amxrt \
                 "

FILES_${PN} += "/usr/lib/amx/la_threshold/*${SOLIBS}"
FILES_${PN}-dev += "/usr/lib/amx/la_threshold/*${SOLIBSDEV}"