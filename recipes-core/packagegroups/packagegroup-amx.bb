DESCRIPTION = "package group for the Ambiorix project"

LICENSE = "MIT"

SECTION = "packagegroup"

inherit packagegroup

PACKAGES = "${PN}"
PROVIDES = "${PACKAGES}"

RDEPENDS_${PN} = " \
    lua \
    libubox20191228 \
    libubus20191227 \
    amxb-inspect \
    amxb-ubus \
    amxb-pcb \
    amxrt \
    amxo-cg \
    amx-dm-demo \
    amx-sync-invoke \
    amx-async-invoke \
    amx-invoke-wait \
    amx-subscribe \
    amx-greeter \
    amx-greeter-using-odl-ftab \
    amx-greeter-using-odl-import \
    amx-greeter-using-odl-import-pcb-style \
    libubox-lua \
    libubus-lua \
    libubus-examples \
    "
