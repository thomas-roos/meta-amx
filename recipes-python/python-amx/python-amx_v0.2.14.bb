

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/bindings/python3.git;protocol=https;nobranch=1"
SRCREV = "v0.2.14"

S = "${WORKDIR}/git/src"

inherit pkgconfig config-amx
inherit setuptools3

SUMMARY = "Python AMX Bindings "
LICENSE += "BSD-2-Clause-Patent & SAH"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

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
