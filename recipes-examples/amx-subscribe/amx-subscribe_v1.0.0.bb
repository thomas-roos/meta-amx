

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/examples/baapi/subscribe.git;protocol=https;nobranch=1"
SRCREV = "v1.0.0"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Asynchronous (eventloop using libevent) subscription client using bus agnostic api (baapi)"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "amx-subscribe"



export CONFIG_SAH_AMX_SUBSCRIBE

CONFIG_SAH_AMX_SUBSCRIBE ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_AMX_SUBSCRIBE \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxb"
DEPENDS += "libamxrt"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxrt"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "${BINDIR}/${COMPONENT}"
