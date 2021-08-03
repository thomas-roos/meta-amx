# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Libamxb is a library that provides an API that makes it possible to connect to different kind of software buses and perform actions on it. This library acts as an mediator between the application using the API and the real bus. The real implementation (communication with a specific bus) is in the backends."
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/libraries/libamxb/"
LICENSE = "BSD-2-Clause-Patent"
SECTION = "lib"
DEPENDS = "libamxc libamxp libamxd uriparser"
DEPENDS_class-native = "libamxc-native libamxp-native libamxd-native uriparser-native"

LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf"

SRCREV = "${PV}"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/libraries/libamxb.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} PREFIX=${prefix} LIBDIR=${libdir} BINDIR=${bindir} INCLUDEDIR=${includedir} VERSION_PREFIX="

do_install() {
        oe_runmake install
}

BBCLASSEXTEND += "native"
