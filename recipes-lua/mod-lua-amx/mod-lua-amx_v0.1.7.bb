

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/mod-lua-amx.git;protocol=https;nobranch=1"
SRCREV = ""

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Ambiorix LUA extension"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "mod-lua-amx"
LUA_DEFAULT_VERSION = "5.4"



export CONFIG_SAH_MOD-LUA-AMX
export CONFIG_SAH_LUA_AMX_LUA_VERSION

CONFIG_SAH_MOD-LUA-AMX ??= "y"
CONFIG_SAH_LUA_AMX_LUA_VERSION ??= ""

SAH_CONFIG += " \
                CONFIG_SAH_MOD-LUA-AMX \
                CONFIG_SAH_LUA_AMX_LUA_VERSION \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxo"
DEPENDS += "lua"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "lua"

#CFLAGS += " -DLUA_INC_PATH "

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/usr/lib/amx/modules/${COMPONENT}.so"
