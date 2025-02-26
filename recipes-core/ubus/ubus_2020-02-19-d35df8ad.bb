DESCRIPTION = "OpenWrt system message/RPC bus"
HOMEPAGE = "https://git.openwrt.org/project/ubus.git"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ubusd.c;beginline=1;endline=12;md5=1b6a7aecd35bdd25de35da967668485d"
SECTION = "base"
DEPENDS = "json-c libubox"

SRC_URI = "\
          git://git.openwrt.org/project/ubus.git;protocol=https;nobranch=1; \
          file://0001-lua5.3-support.patch \
          "

SRCREV = "d35df8adda873dc75d876f72b78e84db8cfa72ee"

ABI_VERSION = "20191227"

S = "${WORKDIR}/git"

inherit cmake openwrt-lua openwrt-virtual-runtimes pkgconfig

EXTRA_OECMAKE += "\
                -DCMAKE_INSTALL_LIBDIR:PATH=${libdir} \
                "

do_install:append(){
    install -dm 0755 ${D}/${sbindir}

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
FILES:lib${PN}${ABI_VERSION} += "${libdir}/libubus.so"
FILES:lib${PN}-lua += "${libdir}/lua/5.3/*"
FILES:lib${PN}-examples += "${bindir}/*.lua"
FILES:${PN}d += "${sbindir} ${base_sbindir}"
