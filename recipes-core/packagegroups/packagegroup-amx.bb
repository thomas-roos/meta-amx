DESCRIPTION = "package group for the Ambiorix project"

LICENSE = "MIT"

SECTION = "packagegroup"

inherit packagegroup

PACKAGES = "${PN}"
PROVIDES = "${PACKAGES}"

RDEPENDS_${PN} = " \
    lua \
    libubox20170601 \
    libubus20170705 \
    amxb-inspect \
    amxb-ubus \
    amxb-pcb \
    baapi-sync-invoke \
    baapi-async-invoke \
    baapi-invoke-wait \
    baapi-subscribe \
    libubox-lua \
    libubus-lua \
    libubus-examples \
    "
