# Class for meta-amx building configuration

LIBDIR ?= "${libdir}"
SLIBDIR ?= "${libdir}"
LUALIBDIR ?= "${libdir}/lua"
INCLUDEDIR ?= "${includedir}"
INITDIR ?= "${sysconfigdir}/init.d"
PROCMONDIR ?= "${libdir}/processmonitor/scripts"
RESETDIR ?= "${sysconfigdir}/reset"
DOCDIR ?= "${docdir}"
PKG_CONFIG_LIBDIR ?= "/usr/lib/pkgconfig"

EXTRA_OEMAKE += "DEST=${D} \
                D=${D}${base_prefix} \
                PREFIX=${prefix} \
                LIBDIR=${libdir} \
                BINDIR=${bindir} \
                INCLUDEDIR=${includedir} \
                "

do_install() {
        oe_runmake install
}
