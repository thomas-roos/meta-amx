# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxb is a library that provides an API that makes it possible to connect to different kind of software buses and perform actions on it. This library acts as an mediator between the application using the API and the real bus. The real implementation (communication with a specific bus) is in the backends."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxb/"
LICENSE = "MIT"
SECTION = "lib"
DEPENDS = "libamxc libamxp libamxd uriparser"

LIC_FILES_CHKSUM = "file://LICENSE;beginline=1;endline=21;md5=12ee6b8140ae9965800c9c380e2c9073"

SRCREV = "v1.0.9"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxb.git;protocol=https;nobranch=1; \
           file://0001-use-regular-getenv-instead-of-secure_getenv.patch \
           "
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_LIB_DIR=lib"

do_install() {
        oe_runmake install
}
