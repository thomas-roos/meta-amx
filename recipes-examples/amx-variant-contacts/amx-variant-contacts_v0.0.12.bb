

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/examples/collections/variant_contacts.git;protocol=https;nobranch=1"
SRCREV = "v0.0.12"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "libamxc - variant example"
LICENSE += "BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "amx-variant-contacts"


DEPENDS += "libamxc"

RDEPENDS:${PN} += "libamxc"

FILES:${PN} += "${BINDIR}/${COMPONENT}"
