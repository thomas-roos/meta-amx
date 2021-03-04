# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxd is a library providing generic API for managing a data model"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxd/"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "lib"
DEPENDS = "libamxc libamxp"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxd.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} LIBDIR=/usr/lib VERSION_PREFIX="

do_install() {
        oe_runmake install
}
