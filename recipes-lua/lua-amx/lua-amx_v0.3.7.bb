

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/lua-amx.git;protocol=https;nobranch=1"
SRCREV = "v0.3.7"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "LUA AMX Bindings "
LICENSE += "BSD-2-Clause-Patent & SAH"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "lua-amx"
LUA_DEFAULT_VERSION = "5.3"



export CONFIG_SAH_LUA_AMX
export CONFIG_SAH_LUA_AMX_LUA_VERSION_OVERRIDE
export CONFIG_SAH_LUA_AMX_LUA_VERSION

CONFIG_SAH_LUA_AMX ??= "y"
CONFIG_SAH_LUA_AMX_LUA_VERSION_OVERRIDE ??= "n"
CONFIG_SAH_LUA_AMX_LUA_VERSION ??= "${@ "" if ( d.getVar("CONFIG_SAH_LUA_AMX_LUA_VERSION_OVERRIDE") != "n") else "n" }"

SAH_CONFIG += " \
                CONFIG_SAH_LUA_AMX \
                CONFIG_SAH_LUA_AMX_LUA_VERSION_OVERRIDE \
                CONFIG_SAH_LUA_AMX_LUA_VERSION \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libamxo"
DEPENDS += "libevent"
DEPENDS += "lua"
DEPENDS += "libevent"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "lua"
RDEPENDS:${PN} += "libevent"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/usr/local/lib/lua/${CONFIG_SAH_LUA_AMX_LUA_VERSION}/lamx.so"
FILES:${PN} += "/usr/local/lib/lua/${LUA_DEFAULT_VERSION}/lamx.so"
FILES:${PN} += "/usr/local/lib/lua/${CONFIG_SAH_LUA_AMX_LUA_VERSION}/lamx_wait_for.lua"
FILES:${PN} += "/usr/local/lib/lua/${LUA_DEFAULT_VERSION}/lamx_wait_for.lua"
FILES:${PN} += "/usr/bin/amx_monitor_dm"
FILES:${PN} += "/usr/bin/amx_wait_for"
