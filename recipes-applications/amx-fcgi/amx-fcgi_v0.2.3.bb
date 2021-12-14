

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi.git;protocol=https;nobranch=1"
SRCREV = ""
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Ambiorix Fast CGI app for web-servers"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "amx-fcgi"


DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "libamxb"
DEPENDS += "libamxa"
DEPENDS += "fcgi"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxj"
RDEPENDS_${PN} += "libamxp"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "libamxo"
RDEPENDS_${PN} += "libamxb"
RDEPENDS_${PN} += "libamxa"
RDEPENDS_${PN} += "fcgi"


FILES_${PN} += "/etc/amx/amx-fcgi/amx-fcgi.odl"
FILES_${PN} += "/usr/lib/amx/amx-fcgi/amx-fcgi.so"
FILES_${PN} += "${BINDIR}/amx-fcgi"
FILES_${PN} += "${INITDIR}/${COMPONENT}"
FILES_${PN} += "${PROCMONDIR}/${COMPONENT}"
FILES_${PN} += "${LIBDIR}/debuginfo/D10${COMPONENT}"
