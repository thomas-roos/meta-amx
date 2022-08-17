

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/examples/collections/htable_contacts.git;protocol=https;nobranch=1"
SRCREV = "v0.0.13"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "libamxc - hash table example"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "amx-htable-contacts"


DEPENDS += "libamxc"

RDEPENDS:${PN} += "libamxc"

FILES:${PN} += "${BINDIR}/${COMPONENT}"
