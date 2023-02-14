# Overwrite the files
FILES:${PN}-dev = "${INCLUDEDIR}/debug/*.h"
FILES:${PN} = "/lib/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${PKG_CONFIG_LIBDIR}/sahtrace.pc"
FILES:${PN}-dev += "/usr/lib/pkgconfig/sahtrace.pc"
FILES:${PN} += "/usr/share/sah_config/libsahtrace.cfg"

# Include the /lib/libsahtrace.so symlink in the normal package
FILES:${PN} += "/lib/${COMPONENT}${SOLIBSDEV}"
FILES_SOLIBSDEV = ""
INSANE_SKIP:${PN} += "dev-so"
