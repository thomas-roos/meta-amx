# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Ubus back-end implementation for bus agnostic API."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/modules/amxb_backends/amxb_ubus"
LICENSE = "BSD-plus-patent"
SECTION = "base"
DEPENDS = "libamxc libamxp libamxb libamxd ubus libubox"

LIC_FILES_CHKSUM = "file://LICENSE;beginline=1;endline=21;md5=12ee6b8140ae9965800c9c380e2c9073"

SRCREV = "v0.1.7"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/modules/amxb_backends/amxb_ubus.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D}"

do_install() {
        oe_runmake install
}
