FILES:${PN}-dev:remove = "/lib/${COMPONENT}${SOLIBSDEV}"
FILES:${PN} += "/lib/${COMPONENT}${SOLIBSDEV}"

FILES_SOLIBSDEV = ""
INSANE_SKIP:${PN} += "dev-so"
