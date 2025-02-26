DESCRIPTION = "package group for the Ambiorix project"

LICENSE = "MIT"

SECTION = "packagegroup"

inherit packagegroup

RDEPENDS:${PN} = " \
    amxb-inspect \
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
    ${@bb.utils.contains('LCM_SYSBUS','ubus','mod-amxb-ubus','',d)} \
    "

# fixing the issue: An allarch packagegroup shouldn't depend on packages which are dynamically renamed
PACKAGE_ARCH = "${MACHINE_ARCH}"
