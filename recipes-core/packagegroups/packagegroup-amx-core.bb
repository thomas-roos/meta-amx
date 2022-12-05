DESCRIPTION = "package group for the Ambiorix project"

LICENSE = "MIT"

SECTION = "packagegroup"

inherit packagegroup

PACKAGES = "${PN}"
PROVIDES = "${PACKAGES}"

RDEPENDS:${PN} = " \
    libamxc \ 
    libamxd \ 
    libamxo \ 
    libamxp \
    libamxj \
    libamxb \
    libamxa \
    libamxt \
    libamxs \
    libamxm \
    amxrt \
    amx-cli \
    mod-ba-cli \
    mod-sahtrace \
    "
