DESCRIPTION = "package group for the Ambiorix project"

LICENSE = "MIT"

SECTION = "packagegroup"

inherit packagegroup

PACKAGES = "${PN}"
PROVIDES = "${PACKAGES}"

RDEPENDS_${PN} = " \
    amxb-inspect \
    mod-amxb-ubus \
    mod-amxb-pcb \
    amxrt \
    amxo-cg \
    amx-subscribe \
    amx-greeter-plugin \
    amx-greeter-app \
    amx-tr181-localagent-threshold \
    amx-variant-contacts \
    amx-llist-contacts \
    amx-htable-contacts \
    amx-fcgi \
    amx-cli \
    amxo-xml-to \
    "
