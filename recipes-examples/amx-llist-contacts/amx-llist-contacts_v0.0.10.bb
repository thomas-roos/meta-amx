

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/examples/collections/llist_contacts.git;protocol=https;nobranch=1"
SRCREV = "v0.0.10"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "libamxc - Linked list example"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE.SAH;md5=a0f6bf5b78959aa070b853b0ad21d9a2 \
                    file://LICENSE.BSD;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf \
                    "

COMPONENT = "amx-llist-contacts"

DEPENDS += "libamxc"

RDEPENDS_${PN} += "libamxc"

FILES_${PN} += "${BINDIR}/${COMPONENT}"

EXTRA_OEMAKE += "DEST=${D} PREFIX=${prefix} LIBDIR=${libdir} BINDIR=${bindir} INCLUDEDIR=${includedir}"
