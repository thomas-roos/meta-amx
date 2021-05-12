# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Ubus back-end implementation for bus agnostic API."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/modules/amxb_backends/amxb_ubus"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "base"
DEPENDS = "libamxc libamxp libamxb libamxd ubus libubox"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/modules/amxb_backends/amxb_ubus.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} PREFIX=${prefix} LIBDIR=${libdir} BINDIR=${bindir} INCLUDEDIR=${includedir} VERSION_PREFIX="

do_install() {
        oe_runmake install
}

SOLIBS = ".so"
SOLIBSDEV = ".so.*"

FILES_${PN}-dev += "${libdir}/*/libamxb_ubus${SOLIBS}"
FILES_${PN} += "${libdir}/*/libamxb_ubus${SOLIBSDEV}"


