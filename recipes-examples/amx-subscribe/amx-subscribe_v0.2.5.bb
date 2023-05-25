

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/examples/baapi/subscribe.git;protocol=https;nobranch=1"
SRCREV = "v0.2.5"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Asynchronous (eventloop using libevent) subscription client using bus agnostic api (baapi)"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "amx-subscribe"



export CONFIG_SAH_AMX_SUBSCRIBE

CONFIG_SAH_AMX_SUBSCRIBE ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_AMX_SUBSCRIBE \
                "

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

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "${BINDIR}/${COMPONENT}"
