

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi.git;protocol=https;nobranch=1"
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

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxa"
RDEPENDS:${PN} += "fcgi"


FILES:${PN} += "/etc/amx/amx-fcgi/amx-fcgi.odl"
FILES:${PN} += "/usr/lib/amx/amx-fcgi/amx-fcgi.so"
FILES:${PN} += "${BINDIR}/amx-fcgi"
FILES:${PN} += "${INITDIR}/${COMPONENT}"
FILES:${PN} += "${PROCMONDIR}/${COMPONENT}"
FILES:${PN} += "${LIBDIR}/debuginfo/D10${COMPONENT}"
