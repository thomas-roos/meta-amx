DESCRIPTION = "Simple example greeter application build using the amx APIs"
HOMEPAGE = "https://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_greeter"
LICENSE = "CLOSED"
SECTION = "examples"
DEPENDS = "libamxc libamxp libamxb libamxd libevent libamxo"

SRCREV = "e9e35b34c6ec8e6761a882876f2ca01763592f83"
SRC_URI = "git://${GIT_BASE_URL}/ambiorix/examples/baapi/amx_greeter.git;protocol=https;nobranch=1;;branch=using_odl_import"
S = "${WORKDIR}/git"

do_install() {
    install -D -m 0644 ${B}/amx_greeter.so ${D}/bin/amx_greeter_using_odl_import/amx_greeter.so
    install -m 0644 ${B}/greeter_definition.odl ${D}/bin/amx_greeter_using_odl_import/greeter_definition.odl
    install -m 0755 ${B}/greeter_main.odl ${D}/bin/amx_greeter_using_odl_import/greeter_main.odl
    install -m 0644 ${B}/greeter_values.odl ${D}/bin/amx_greeter_using_odl_import/greeter_values.odl
    ln -s amx_greeter_using_odl_import/greeter_main.odl ${D}/bin/amx_greeter_using_odl_import_main.odl
}
