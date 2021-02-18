# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "PCB back-end implementation for bus agnostic API."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/modules/amxb_backends/amxb_pcb"
LICENSE = "BSD-plus-patent"
SECTION = "base"
DEPENDS = "libamxc libamxb libamxd libpcb"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b144ccd4a02477481c61bc89602d4400"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/modules/amxb_backends/amxb_pcb.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} VERSION_PREFIX="

do_install() {
        oe_runmake install
}

FILES_${PN}-dev += "${bindir}/mods/amxb/mod-amxb-pcb.so"
