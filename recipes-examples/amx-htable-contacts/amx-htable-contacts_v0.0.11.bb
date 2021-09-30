

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/examples/collections/htable_contacts.git;protocol=https;nobranch=1"
SRCREV = "v0.0.11"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "libamxc - hash table example"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf \
          "

COMPONENT = "amx-htable-contacts"


DEPENDS += "libamxc"

RDEPENDS_${PN} += "libamxc"

FILES_${PN} += "${BINDIR}/${COMPONENT}"
