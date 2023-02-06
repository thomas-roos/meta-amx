DESCRIPTION = "package group for the Ambiorix project"
SUMMARY = "Required packages to run Ambiorix bus converter"
PR = "r1"

inherit packagegroup

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
