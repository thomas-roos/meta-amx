# Packagegroups ubus sysbus

SUMMARY = "Enable ubus sysbus"
PR = "r1"

# Packagegroup to enable ubus as system bus

inherit packagegroup

DEPENDS += "libubox"
RDEPENDS:${PN} = "\
    ubus \
    ubusd \
    mod-amxb-ubus \
"