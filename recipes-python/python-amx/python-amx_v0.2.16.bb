

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/bindings/python3.git;protocol=https;nobranch=1"
SRCREV = "v0.2.16"

S = "${WORKDIR}/git/src"

inherit pkgconfig config-amx
inherit setuptools3

SUMMARY = "Python AMX Bindings "
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "python-amx"



export CONFIG_SAH_PYTHON_AMX

CONFIG_SAH_PYTHON_AMX ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_PYTHON_AMX \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxb"
DEPENDS += "libevent"
DEPENDS += "python3"
DEPENDS += "python3-native"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libevent"
RDEPENDS:${PN} += "python3"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "
