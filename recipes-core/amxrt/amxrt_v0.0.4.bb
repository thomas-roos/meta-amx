DESCRIPTION = "Data model runtime"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/applications/amxrt"
LICENSE = "BSD-plus-patent"
SECTION = "applications"
DEPENDS = "libevent libamxc libamxp libamxd libamxb libamxo"

LIC_FILES_CHKSUM = "file://LICENSE;beginline=1;endline=21;md5=95e8fbfc71f3d0c82aee71089b47a04c"

SRCREV = "v0.0.4"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/applications/amxrt.git;protocol=https;nobranch=1;"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DEST=${D} INSTALL_BIN_DIR=bin"

do_install() {
        oe_runmake install
}
