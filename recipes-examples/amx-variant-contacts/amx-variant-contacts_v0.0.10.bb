

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/examples/collections/variant_contacts.git;protocol=https;nobranch=1"
SRCREV = "v0.0.10"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "libamxc - variant example"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"

COMPONENT = "amx-variant-contacts"


DEPENDS += "libamxc"

RDEPENDS_${PN} += "libamxc"

FILES_${PN} += "${BINDIR}/${COMPONENT}"
