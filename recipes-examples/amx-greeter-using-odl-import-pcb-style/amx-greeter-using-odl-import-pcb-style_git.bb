DESCRIPTION = "Simple example greeter application build using the amx APIs"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_greeter"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxp libamxb libamxd libevent libamxo"

SRCREV = "c3e9412c84aa87ddc7828ab318d53e4b7b4f93ba"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_greeter.git;protocol=https;nobranch=1;;branch=using_odl_import_pcb_style"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0644 ${B}/greeter.so ${D}/bin/amx_greeter_using_odl_import_pcb_style/amx_greeter.so
    install -m 0644 ${B}/greeter.odl ${D}/bin/amx_greeter_using_odl_import_pcb_style/greeter.odl
    install -m 0644 ${B}/greeter_definition.odl ${D}/bin/amx_greeter_using_odl_import_pcb_style/greeter_definition.odl
    install -m 0644 ${B}/greeter_defaults.odl ${D}/bin/amx_greeter_using_odl_import_pcb_style/greeter_defaults.odl
    ln -s amx_greeter_using_odl_import_pcb_style/greeter.odl ${D}/bin/amx_greeter_using_odl_import_pcb_style.odl
}
