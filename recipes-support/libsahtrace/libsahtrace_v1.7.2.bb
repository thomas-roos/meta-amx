

LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

SRC_URI = "git://gitlab.com/soft.at.home/logging/libsahtrace.git;protocol=https;nobranch=1"
S = "${WORKDIR}/git"
SRCREV = "v1.7.2"
inherit pkgconfig config-amx

SUMMARY = "Small and flexible library to enable tracing and logging"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "libsahtrace"





FILES:${PN}-dev += "${INCLUDEDIR}/debug/*.h"
FILES:${PN} += "/lib/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${PKG_CONFIG_LIBDIR}/sahtrace.pc"
