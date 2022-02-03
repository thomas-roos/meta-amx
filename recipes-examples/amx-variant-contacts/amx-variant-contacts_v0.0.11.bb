

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/examples/collections/variant_contacts.git;protocol=https;nobranch=1"
SRCREV = "v0.0.11"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "libamxc - variant example"
LICENSE += "BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf"
COMPONENT = "amx-variant-contacts"


DEPENDS += "libamxc"

RDEPENDS:${PN} += "libamxc"

FILES:${PN} += "${BINDIR}/${COMPONENT}"
