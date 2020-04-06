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
    baapi-sync-invoke \
    baapi-async-invoke \
    baapi-invoke-wait \
    baapi-subscribe \
    baapi-amx-greeter \
    libubox-lua \
    libubus-lua \
    libubus-examples \
    "
