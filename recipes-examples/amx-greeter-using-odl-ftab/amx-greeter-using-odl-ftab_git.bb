DESCRIPTION = "Simple example greeter application build using the amx APIs"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_greeter"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxp libamxb libamxd libevent libamxo"

SRCREV = "4eaed2fa020b481f157eefcbf4e36dbd4def6e43"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_greeter.git;protocol=https;nobranch=1;;branch=using_odl_ftab"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0755 ${B}/amx_greeter ${D}/bin/amx_greeter_using_odl_ftab/amx_greeter
    install -m 0644 ${B}/greeter_definition.odl ${D}/bin/amx_greeter_using_odl_ftab/greeter_definition.odl
    install -m 0755 ${B}/greeter_main.odl ${D}/bin/amx_greeter_using_odl_ftab/greeter_main.odl
    install -m 0644 ${B}/greeter_values.odl ${D}/bin/amx_greeter_using_odl_ftab/greeter_values.odl
    ln -s amx_greeter_using_odl_ftab/amx_greeter ${D}/bin/amx_greeter_using_odl_ftab_app
}
