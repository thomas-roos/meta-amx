

SRC_URI = "git://gitlab.com/soft.at.home/ambiorix/examples/collections/llist_contacts.git;protocol=https;nobranch=1"
SRCREV = "v0.0.10"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "libamxc - Linked list example"
LICENSE += "SAH & BSD-2-Clause-Patent"

LIC_FILES_CHKSUM = " \
                    file://LICENSE.SAH;md5=a0f6bf5b78959aa070b853b0ad21d9a2 \
                    file://LICENSE.BSD;md5=125e02a02b68754758e33699fe6cd6bf \
                    "

COMPONENT = "amx-llist-contacts"

DEPENDS += "libamxc"

RDEPENDS_${PN} += "libamxc"

FILES_${PN} += "${BINDIR}/${COMPONENT}"
