# This file Copyright (C) 2015 Khem Raj <raj.kem@gmail.com> and
#
# It is released under the MIT license.  See COPYING.MIT
# for the terms.

OECMAKE_C_FLAGS += "-DLUA_COMPAT_5_3"
EXTRA_OECMAKE += "-DLUAPATH=${libdir}/lua/5.3"

FILES:${PN}  += "${datadir}/lua/"
FILES:${PN}-dbg  += "${libdir}/lua/.debug"

DEPENDS += "lua"
OECMAKE_C_FLAGS += "-I${STAGING_INCDIR}/lua5.3"
CFLAGS += "-I${STAGING_INCDIR}/lua5.3"

do_configure:prepend () {
    if [ -e "${S}/CMakeLists.txt" ] ; then
        sed -i -e \
	"s:ARCHIVE DESTINATION lib:ARCHIVE DESTINATION \${CMAKE_INSTALL_LIBDIR}:g" \
	-e "s:LIBRARY DESTINATION lib:LIBRARY DESTINATION \${CMAKE_INSTALL_LIBDIR}:g" \
	${S}/CMakeLists.txt
    fi
}
