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
    amxrt \
    "

#libamxb_pcb
#sah_mod_sahtrace

