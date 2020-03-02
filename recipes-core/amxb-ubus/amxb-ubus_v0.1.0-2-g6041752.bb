# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Ubus back-end implementation for bus agnostic API."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/modules/amxb_backends/amxb_ubus"
LICENSE = "MIT"
SECTION = "base"
DEPENDS = "libamxc libamxp libamxb ubus libubox"

LIC_FILES_CHKSUM = "file://LICENSE;beginline=1;endline=21;md5=12ee6b8140ae9965800c9c380e2c9073"

SRCREV = "6041752e6afd1cfac0bef906bc1e25fd753aef54"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/modules/amxb_backends/amxb_ubus.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D}"

do_install() {
        oe_runmake install
}
