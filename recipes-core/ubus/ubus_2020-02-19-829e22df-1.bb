DESCRIPTION = "OpenWrt system message/RPC bus"
HOMEPAGE = "https://${GIT_BASE_URL}/peter.deherdt/ubus"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ubusd.c;beginline=1;endline=12;md5=1b6a7aecd35bdd25de35da967668485d"
SECTION = "base"
DEPENDS = "json-c libubox"

SRC_URI = "git://${GIT_BASE_URL}/peter.deherdt/ubus.git;branch=dev_sah;protocol=https;nobranch=1;"

SRCREV = "829e22df7e87d8505154e1d1fdba1cc2246ccf03"

ABI_VERSION = "20170705"

S = "${WORKDIR}/git"

inherit cmake pkgconfig openwrt-lua openwrt-virtual-runtimes

EXTRA_OECMAKE += "\
                -DCMAKE_INSTALL_LIBDIR:PATH=/lib \
                "

do_install_append () {
    install -dm 0755 ${D}/sbin
    ln -s /usr/sbin/ubusd ${D}/sbin/ubusd

    install -m 0755 ${S}/lua/publisher.lua ${D}${bindir}
    install -m 0755 ${S}/lua/subscriber.lua ${D}${bindir}
    install -m 0755 ${S}/lua/test_client.lua ${D}${bindir}
    install -m 0755 ${S}/lua/test.lua ${D}${bindir}
}

PACKAGES =+ "\
            lib${PN}${ABI_VERSION} \
            lib${PN}-lua \
            lib${PN}-examples \
            ${PN}d \
            "

FILES_SOLIBSDEV = ""
FILES_lib${PN}${ABI_VERSION} += "/lib/libubus.so"
FILES_lib${PN}-lua += "${libdir}/lua/5.3/*"
FILES_lib${PN}-examples += "${bindir}/*.lua"
FILES_${PN}d += "${sbindir} ${base_sbindir}"
