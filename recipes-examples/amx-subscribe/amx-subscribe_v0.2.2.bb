

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/examples/baapi/subscribe.git;protocol=https;nobranch=1"
SRCREV = "v0.2.2"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "Asynchronous (eventloop using libevent) subscription client using bus agnostic api (baapi)"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "amx-subscribe"


DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libevent"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libevent"

FILES:${PN} += "${BINDIR}/${COMPONENT}"
