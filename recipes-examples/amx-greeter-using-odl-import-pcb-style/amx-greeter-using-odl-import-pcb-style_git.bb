DESCRIPTION = "Simple example greeter application build using the amx APIs"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_greeter"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxp libamxb libamxd libevent libamxo"

SRCREV = "593403802677574e733a1dddfe0dac4756d5b23a"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_greeter.git;protocol=https;nobranch=1;;branch=using_odl_import_pcb_style"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0644 ${B}/amx_greeter.so ${D}/bin/amx_greeter_using_odl_import_pcb_style/amx_greeter.so
    install -m 0644 ${B}/greeter.odl ${D}/bin/amx_greeter_using_odl_import_pcb_style/greeter.odl
    install -m 0644 ${B}/greeter_definition.odl ${D}/bin/amx_greeter_using_odl_import_pcb_style/greeter_definition.odl
    install -m 0644 ${B}/greeter_values.odl ${D}/bin/amx_greeter_using_odl_import_pcb_style/greeter_values.odl
    ln -s amx_greeter_using_odl_import_pcb_style/greeter.odl ${D}/bin/amx_greeter_using_odl_import_pcb_style.odl
}
