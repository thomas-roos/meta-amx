# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]


## Release honister_v11.3.5 - 2024-01-10(12:19:33 +0000)

### Other

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): update documentation for amxb_wait_for_object
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): update documentation for amxb_wait_for_object

## Release honister_v11.3.4 - 2024-01-10(11:05:16 +0000)

## Release honister_v11.3.3 - 2024-01-10(10:52:08 +0000)

### Fixes

- [libamxm](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxm): Adapt description of ambiorix packages
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [WNC-CHR2][LCM] SoftwareModules cannot be found
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): [amx-cli] Allow proper escaping of variable in cli for input and display

## Release honister_v11.3.2 - 2024-01-10(10:16:15 +0000)

### Fixes

- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Adapt description of ambiorix packages
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): [amx-cli] Allow proper escaping of variable in cli for input and display

## Release honister_v11.3.1 - 2024-01-10(08:35:55 +0000)

### Fixes

- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): [Amxs] Apply sync direction to all child entries recursively

## Release honister_v11.3.0 - 2024-01-08(14:27:52 +0000)

### Other

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): call destroy callback on root object destruction

## Release honister_v11.2.0 - 2023-12-19(14:46:57 +0000)

### New

- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): Refactor libamxo - libamxp: move fd and connection management out of libamxo
- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): Add parameter constraints to generated xml files
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): - [prpl][libamxc] amxc_set_to_string only use space as separator
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): [libamxc] Some characters in amxc string can have special purpose and it must be possible to escape them
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Add posibility for action handlers to provide a description
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Make it possible to declare synchronization templates in odl files
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Add parameter constraints to generated xml files
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [libamxo]Make it possible to define object synchronisation in odl
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Refactor libamxo - libamxp: move fd and connection management out of libamxo
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): Refactor libamxo - libamxp: move fd and connection management out of libamxo
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): Add support for named and search paths in sync ctx
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): Add support for read-only parameters in a local datamodel
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): Make it possible to declare synchronization templates in odl files
- [lua-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/lua-amx): ambiorix lua bindings must be extended
- [lua-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/lua-amx): ambiorix lua bindings must be extended
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Add posibility for action handlers to provide a description
- [mod-dmext](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmext): Add posibility for action handlers to provide a description
- [mod-dmext](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmext): CLONE - [Data model] Add (X_PRPL-COM_)WINSServer parameter in DHCPv4 Server Pool: part 1, provide DataModel
- [mod-dmext](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmext): [mod-dmext]Improve and extend object reference functionality
- [mod-sahtrace](https://gitlab.com/prpl-foundation/components/core/modules/mod-sahtrace): Implement a global Logging policy.

### Fixes

- [acl-manager](https://gitlab.com/prpl-foundation/components/ambiorix/applications/acl-manager): Fix license headers in files
- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): Fix license headers in files
- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): [amx-cli]List doesn't provide output when redirected to file
- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): [cli] Reduce syslog messages when starting ubus-cli/ba-cli/...
- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): Add timestamp for events printed in AMX CLI
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): [amx-fcgi]Segfault detected with unit-tests
- [amxb-inspect](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxb-inspect): Fix license headers in files
- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): Fix license headers in files
- [amxo-xml-to](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to): Fix license headers in files
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Fix the linker again, errors were still encountered with the previous one
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Fix license headers in files
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): [AMX] libamxo linker issue
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): ACL checking broken for add  without search path
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [libamxb]Segfault when local async-call in progress and conection lost to bus system
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [libamxb]Segfault when local async-call in progress and conection lost to bus system
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [libamxb]Possible memory leak when async request are open on local datamodel when exiting
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Inconsistent status types in amxb_get_multiple and amxb_set_multiple
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [AMX] Cache size is not updated correctly
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [AMX] Add extra NULL pointer checks
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [libamxb]Memory leak - closed pending asynchronous request are not freed when disconnecting
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [PRPL OJO NOKIA][GMAP] The GMap server crashes when a new wired device, like an IP printer or IP camera, is plugged in.
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): tr181-usermanagement segfault during startup
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [AMX] Only return objects that contain the parameter
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [AMX] Only return objects that contain the parameter
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [AMX] Make it possible to _exec functions with braces
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Update and extend documentation
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Fix license headers in files
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [WiFi] Cannot use a WiFi password containing the character "
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [Amxo] Cannot create synchronization template without adding "{i}." to the objects
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): pwhm datamodel load failure after reboot
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [libamxp]Memory when parsing invalid list value
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Update and extend documentation
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): [amxrt][no-root-user][capability drop] failed to add capabilities for a forked process
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): [AMX] Only detect sockets for loaded backends
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): [amxrt] Need to load backends from multiple directories
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): [libamxo]Make it possible to define object synchronisation in odl
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): Avoid infinite event loop in bidirectional parameter sync
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): Set entry pointer to NULL if initialization fails
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): Fix batch parameter sync direction
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): [AMX] Only return objects that contain the parameter
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): [amx-cli]List doesn't provide output when redirected to file
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): Ubus-cli does not start if no tty is available
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): pcb_cli parameter query returns error when query-ing amx parameter
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Full objects are replied when it is not needed
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [DataModel][TR-181]"Device.DeviceInfo.VendorConfigFile.Date" parameter type Not as expected
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Fix license headers in files
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Modify libbart for PCB Components Compatibility with PCM-Manager
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Wifi NOK on Safran prpl mainline
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): [amx-cli]Completion on empty or root object is not working when using multiple connections
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Fix license headers in files
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): [amx-cli]List doesn't provide output when redirected to file
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): [amx-cli]Completion on empty or root object is not working when using multiple connections
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Wifi NOK on Safran prpl mainline
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): [ba-cli] bus URIs duplicated
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Update ba-cli bus commands documentation
- [mod-dm-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-dm-cli): Fix license headers in files
- [mod-dmext](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmext): Fix license headers in files
- [mod-dmext](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmext): [TR181 LED] Defaults are not loaded when log level is set via CLI
- [mod-dmext](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmext): set_object_ref no longer accepts empty strings
- [mod-dmproxy](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmproxy): [LCM][usp] objectcreation and objectdeletion notifications no longer received
- [mod-dmproxy](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmproxy): [AMX] Device prefix missing for add responses to search paths

### Changes

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): - [UI][LAN versus WAN admin] Allow the WAN and the LAN UI to have different ACL(users)
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): [ConnDB][WebUI] Create a webui for the connection database
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): [ServiceID][WebUI] set correct acl settings for webui
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [CDROUTER][USP] usp_conformance_10_13 : Cannot add a new MQTT BulkData Profile
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Add and update documentation
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Refactor libamxo - libamxp: move fd and connection management out of libamxo
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [libamxo]Update odl documentation and API regarding object synchronisation
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): Include extensions directory in ODL
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): [amxrt] Need to load backends from multiple directories
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): [libamxo]Make it possible to define object synchronisation in odl
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): Refactor libamxo - libamxp: move fd and connection management out of libamxo
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): Refactor libamxo - libamxp: move fd and connection management out of libamxo
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): [doc]Describe how to access ubusd as non-root user
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Refactor libamxo - libamxp: move fd and connection management out of libamxo
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): [mod-ba-cli]The cli is always resolving environment variables and configuration variables
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Extend help of get command `?`
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Add timestamp for events printed in AMX CLI
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Add and update documentation
- [mod-dm-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-dm-cli): Refactor libamxo - libamxp: move fd and connection management out of libamxo

### Other

- [acl-manager](https://gitlab.com/prpl-foundation/components/ambiorix/applications/acl-manager): Add the BSD-2-Clause-Patent license
- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): [AMX] libamxo linker issue
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): - [prpl][libamxa] Create an object using a search path isn't allowed
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Issue ST-1184 [amxb][amxc][amxo][amxrt] Fix typos in documentation
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [amxb][amxc][amxo][amxrt] Fix typos in documentation
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Issue ST-1184 [amxb][amxc][amxo][amxrt] Fix typos in documentation
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): [amxb][amxc][amxo][amxrt] Fix typos in documentation
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Issue ST-1184 [amxb][amxc][amxo][amxrt] Fix typos in documentation
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [amxb][amxc][amxo][amxrt] Fix typos in documentation
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): Issue ST-1184 [amxb][amxc][amxo][amxrt] Fix typos in documentation
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): [amxb][amxc][amxo][amxrt] Fix typos in documentation
- [lua-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/lua-amx): Add example lua script
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP] [Add_msg] Wrong error code in the response when a Add message is requested with an invalid parameter or value.
- [mod-dmproxy](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmproxy): CLONE - [CHR2fA] tr181-device plugin crash (short term)

## Release honister_v11.1.2 - 2023-10-13(14:42:01 +0000)

## Release honister_v11.1.1 - 2023-10-10(03:24:22 +0000)

## Release honister_v11.1.0 - 2023-10-09(13:54:34 +0000)

### New

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): [amx-fcgi] Add reporting of number of unsuccessful login attempts

### Fixes

- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): [amx-cli]Redirecting output to file prints error
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): - [amx-fcgi] admin user cannot add to Device.Routing.Router.[Alias=='main'].IPv4Forwarding.
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): - [prpl][amx-fcgi] amx_fcgi_http_subscribe return wrong status code
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): - [ACL][libamxa] When a search path is allowed but not its fixed part amxa_get fail
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): Fix license headers in files
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Don't return listen context from who_has
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Fix license headers in files
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [PRPL][SAFRAN] Wan is not up after reset, only after additional reboot
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Subscriptions on mib objects not correctly removed
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Fix license headers in files
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): amxb_describe() returning non expected results over the pcb bus
- [libamxj](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxj): Improve and omptimize some parts for speed
- [libamxm](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxm): Fix license headers in files
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Improve and optimize some parts for speed
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Fix license headers in files
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): Fix license headers in files
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): Fix license headers in files
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): [ubus-cli/ba-cli] Pasting multiple commands trims first letters
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): amx-cli crash when unhandled key strokes are pressed
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): [CHR2fA] ubus-cli console generate a segmentation fault
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [tr181-device] Crash during boot
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [tr181-device] Crash during boot and shutdown
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): amx path queries to pcb bus are missing entries
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Fix license headers in files
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): amxb_describe() returning non expected results over the pcb bus
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): High CPU and Memory usage
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): It must be possible to call native ubus object methods
- [mod-dmproxy](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmproxy): [PRPL][SAFRAN] Wan is not up after reset, only after additional reboot

### Changes

- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): [ubus-cli/ba-cli] Read commands from stdin
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): allow amxc_var_dump with FILE*
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): [tr181-device] Crash during boot
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): Create directory before user privilege and capability dropping
- [mod-sahtrace](https://gitlab.com/prpl-foundation/components/core/modules/mod-sahtrace): Only save trace-zones

### Other

- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Develop generic prpl voiceactivation module
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): [Ambiorix] Build error on KPN SW2 caused by opensource_libcapng=gen_v0.8.2
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): Remove duplicate CI variable
- [mod-dmproxy](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmproxy): [mod_dmproxy] fix missing libsahtrace search path
- [mod-dmproxy](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmproxy): Crash during shutdown

## Release honister_v11.0.4 - 2023-10-09(11:34:29 +0000)

## Release honister_v11.0.3 - 2023-09-22(09:29:04 +0000)

## Release honister_v11.0.2 - 2023-09-21(10:25:17 +0000)

## Release honister_v11.0.1 - 2023-09-13(13:40:05 +0000)

## Release honister_v11.0.0 - 2023-09-12(17:40:53 +0000)

### Breaking

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [USP] GSDM should return whether commands are (a)sync
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [USP] GSDM should return whether commands are (a)sync

### New

- [amx-subscribe](https://gitlab.com/prpl-foundation/components/ambiorix/examples/baapi/subscribe): use new AMXRT prefix macro
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Use new AMXRT prefixed macros

### Fixes

- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): bus agnostic cli must be able to auto detect backends and sockets
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): - [prpl][user-management] Users role paths are not tr181 paths
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): Enforce coding style - no declarations after code
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Enforce coding style - no declarations after code
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): When using GCC 12.2 extra compilation wanings pop-up
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): It is not possible to declare events in a mib
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Add documentation about data model modules - extensions
- [libamxj](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxj): casting empty jstring to any causes crash
- [libamxj](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxj): [libamxj]Add api doxygen documentation
- [libamxm](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxm): Enforce coding style - no declarations after code
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Update documentation for amxo_parser_get_config()
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): It is not possible to declare events in a mib
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): ODL parser fails to open file in root directory
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Update - extend odl documentation
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): amxp singal pipefds should be closed when spawning child processes
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Expression function contains should be able to use a list of values
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [libamxp] When enable or disable a scheduler it is possible that signals are not emitted or triggered
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): Do not remove readme file when opesourcing
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): Enforce coding style - no declarations after code
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): Enforce coding style - no declarations after code
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): Enforce coding style - no declarations after code
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [tr181-device] Crash during boot
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP] GSDM should return whether commands are (a)sync
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): bus agnostic cli must be able to auto detect backends and sockets
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): [ba-cli] output in 10s when ba-cli query invoked from console
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Memory leak in ba-cli with auto-connect functionality
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): bus agnostic cli must be able to auto detect backends and sockets
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): bus agnostic cli must be able to auto detect backends and sockets

### Changes

- [amx-greeter-plugin](https://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/greeter_plugin): [USP] GSDM should return whether commands are (a)sync
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [libamxp]Scheduler api should be more tolerant regarding spaces in days of week list
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP] GSDM should return whether commands are (a)sync
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): [USP] GSDM should return whether commands are (a)sync

### Other

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): [amx-fcgi][SWUpdate] Upload command should stream file directly to the disk
- [amx-greeter-app](https://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/greeter_app): - solve minor makefile errors and use AMXRT_ macro prefix
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Make the AMX Bus Rust API safe-to-use
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): - Refactor libamxrt for compatibility with prplmesh

## Release honister_v10.1.4 - 2023-07-06(13:48:28 +0000)

### Fixes

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): [amx-fcgi] Error 404 on REST API call on a empty table result
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): [AMX] Add be data-uris to top level data-uris

### Changes

- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [AMX] Define default sockets in backends
- [mod-dmproxy](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmproxy): [DMProxy] Device. datamodel is not responding anymore if a proxied component is no responding

### Other

- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): [AMX] Define default sockets in backends

## Release honister_v10.1.3 - 2023-06-30(15:18:23 +0000)

### Fixes

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Plugins crashing because of segfault in ambiorix

### Changes

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Add requests with search paths are allowed
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Add requests with search paths are allowed

## Release honister_v10.1.2 - 2023-06-28(12:24:42 +0000)

### Fixes

- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): [AMX] Crash with new libamxrt

## Release honister_v10.1.1 - 2023-06-27(19:19:32 +0000)

## Release honister_v10.1.0 - 2023-06-27(18:29:26 +0000)

### New

- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): [amx][capabilities] Add support for reduced capabilities in ambiorix

## Release honister_v10.0.0 - 2023-06-27(16:47:22 +0000)

### New

- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): use libamxrt

### Fixes

- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Segmentation fault can occur when timers are added or deleted from within a timer callback

## Release honister_v9.0.0 - 2023-06-21(14:39:49 +0000)

### New

- [amx-greeter-app](https://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/greeter_app): use libamxrt
- [amx-subscribe](https://gitlab.com/prpl-foundation/components/ambiorix/examples/baapi/subscribe): use libamxrt
- [libamxrt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxrt): Component added

### Fixes

- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): When a schedule item is changed and is currently started send a stop event
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): [ubus-cli] extra rpc arguments not returned
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Remove destructor and use exit function

## Release honister_v8.0.4 - 2023-06-15(07:26:44 +0000)

## Release honister_v8.0.3 - 2023-06-15(06:22:51 +0000)

### Fixes

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Failing transactions not fully cleaned

### Other

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Issue: ambiorix/libraries/libamxd#153 Sending an object event with object, eobject or path in the event data causes never ending loop

## Release honister_v8.0.2 - 2023-06-06(10:34:02 +0000)

### Fixes

- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Add more unit tests

## Release honister_v8.0.1 - 2023-06-02(08:19:41 +0000)

### Fixes

- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Regression in ubus back-end due to changes in error code passing.

## Release honister_v8.0.0 - 2023-06-01(22:27:02 +0000)

### New

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): [TR181-DeviceInfo][FCGI] Add rpc to read/write a file
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): [amx-fcgi]Refactor sessions code to make it easier to run the provided web-ui example

### Fixes

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): [TR181-DeviceInfo][FCGI] Add rpc to read/write a file

### Other

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): - [HTTPManager][Login][amx-fcgi] Create a session
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): - [HTTPManager][Login] Increase unit test coverage

## Release honister_v7.5.0 - 2023-06-01(21:12:06 +0000)

### New

- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): [PCB] add option to pcb-cli to mimic operator (usp) access
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [USP] GSDM events need to be filtered out

## Release honister_v7.4.0 - 2023-05-31(13:14:09 +0000)

### New

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [AMX] Ambiorix should return the same error codes regardless of the used bus
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [AMX] Ambiorix should return the same error codes regardless of the used bus
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): [AMX] Ambiorix should return the same error codes regardless of the used bus

### Fixes

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [AMX] Ambiorix should return the same error codes regardless of the used bus

### Other

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): Update documentation

## Release honister_v7.3.2 - 2023-05-30(09:47:02 +0000)

### Fixes

- [lua-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/lua-amx): Fix return values and throwing errors
- [mod-lua-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/mod-lua-amx): Add unit tests

## Release honister_v7.3.1 - 2023-05-26(12:57:44 +0000)

### Fixes

- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): Link with libyajl
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Scheduler does not take correct duration into account when multiple schedules expire at the same moment

## Release honister_v7.3.0 - 2023-05-25(17:03:50 +0000)

### New

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [USP] Add specific error codes for get instances

### Changes

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [USP] Add specific error codes for get instances

## Release honister_v7.2.1 - 2023-05-25(06:49:43 +0000)

## Release honister_v7.2.0 - 2023-05-24(20:56:23 +0000)

### New

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [Security][USP] Add ACLs for get instances to USP agent

## Release honister_v7.1.3 - 2023-05-24(20:29:57 +0000)

## Release honister_v7.1.2 - 2023-05-24(19:24:33 +0000)

### Fixes

- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): [AMX] Get instances supports search paths

## Release honister_v7.1.1 - 2023-05-24(18:22:10 +0000)

## Release honister_v7.1.0 - 2023-05-24(16:13:04 +0000)

### New

- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [libamxp]Provide API for cron expression parsing and calculating next occurence

### Fixes

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Add documentation to default action implementations

### Other

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Documentation is missing for the get_instances operator
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Issue: ambiorix/libraries/libamxb#68 Documentation is missing for the get_instances operator

## Release honister_v7.0.1 - 2023-05-23(11:04:10 +0000)

### Other

- [acl-manager](https://gitlab.com/prpl-foundation/components/ambiorix/applications/acl-manager): - [HTTPManager][Login][amx-fcgi] Create a session

## Release honister_v7.0.0 - 2023-05-23(07:48:25 +0000)

### Breaking

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): gsdm missing arguments for commands and events

### New

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): gsdm missing arguments for commands and events

### Fixes

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [HTTPManager][Login][acl-manager] After firstboot acl group doesn't exist
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): gsdm missing arguments for commands and events
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): [amxc] Fix missing semicolon
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [unit-tests] Complete and extend unit tests
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Fix regression in amxd_path api
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [AMX] Changing optional parameters gives no events
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Use index paths when sending events after an odl file is parsed
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Check if htables are initialized
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): gsdm missing arguments for commands and events

### Changes

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): - [HTTPManager][Login][amx-fcgi] Create a session
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [USP] Must be able to call methods with named path

### Other

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Issue: ambiorix/applications/amx-fcgi#16 Document how to launch the example webui in a container
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Create the voice interface between ubus and pcb (tr104i1/2 mapper)

## Release honister_v6.1.0 - 2023-05-04(16:01:45 +0000)

### New

- [mod-dmproxy](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmproxy): Component added

## Release honister_v6.0.0 - 2023-04-25(11:02:43 +0000)

### Breaking

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Remove deprecated odl syntax and pcb compatibility syntax

### New

- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb):  Implement capabilities and has function for object discovery

### Fixes

- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): Fixes unit tests, removed deprecated syntax in tests
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): access to DM LocalAgent. using amxb_get fail on EW
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): ODL syntax documentation must be updated
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): [Amxs] Parameter callbacks are not called when an object instance is added
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Fix unit tests, remove deprecated odl syntax
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [V12][USP] Push notification is not sent
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): has must fail on empty object lookup
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Fix unit-tests, update test odls remove deprecated syntax

## Release honister_v5.1.0 - 2023-04-25(10:48:41 +0000)

## Release honister_v5.0.0 - 2023-04-20(09:09:59 +0000)

### Breaking

- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Improve logical expression parser

### New

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): [amx-fcgi][SWUpdate] Add upload file functionality
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [USP] Requirements for Get further clarified
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [AMX] Take bus access into account for GSDM
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [pcb] usp endpoint doesn't support pcb requests
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [USP] Requirements for Get further clarified
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [AMX] Take bus access into account for GSDM
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): AMX : make it possible to to define event handlers directly under object
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [prpl][tr181-upnp] UPnP.Discovery and UPnP.Description are not implemented
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): Some control key sequences are incorrect defined
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [pcb] usp endpoint doesn't support pcb requests
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [AMX] Take bus access into account for GSDM
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Add json output format to cli (ubus-cli, pcb-cli, ba-cli)

### Fixes

- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): Issue:  HOP-2086 [WNC] Keyboard arrows not working within ubus-cli on serial
- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): [AMX][CLI] Scripting: ubus-cli or ba-cli doesn't output anything without a pseudo-terminal
- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): [AMX] gdbgui provides full path of cli module
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Fix and complete unit tests
- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): amxo-cg fails to build correct include tree when parsing error occurs
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Can write event must only be created once
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Listen socket connections are not removed from the event loop
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [amx pcb]Who has on search paths with pcb back-end is not working
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [TR069-manager] [wnc] No ManagementServer object for wnc
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Object path verification should be done when subscribing
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [AMX] Unable to unsubscribe from search path
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Ignore empty read filter
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [amxd] methods with amxd_aattr_out argument return NULL
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [AMX] Protected objects should not be retrieved by gsdm
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Mop test netmodel_02_check_interfaces_test.py::test_wan_isup_query_loop fails due to unexpected out argument
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [uspagent] The 'Discovery' object in the dm cannot use gsdm
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): amxd_object_get_param_value should have its object parameter const
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [USP][AMX] GSDM needs a ValueChangeType
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Data model functions arguments don't inherit attributes from mib
- [libamxj](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxj): [AMX] Reduce write calls done in amxj_write
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Improvements in amxp regarding amxp_dir_scan, timer documentation and slot disconnects
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [SSH][AMX] Processes spawned by dropbear instance managed SSH Manager ignores SIGINT
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): unbound does not start after reboot in tagged mode
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [CDROUTER][IPv6] Box sends 2 ICMPv6 RA when a RS is received on LAN
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Fix memory leakj wehn empty expression is used
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): Always execute the initial sync with protected access
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): [WNC] Keyboard arrows not working within ubus-cli on serial
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): [AMX][CLI] Scripting: ubus-cli or ba-cli doesn't output anything without a pseudo-terminal
- [lua-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/lua-amx): Fix conditions when `luaL_setfuncs` should be set
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Onboarding Issue : Sometimes, PUBLISH is not sent
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [V12][USP] Push notification is not sent
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [Amxs][PCB] Amxs initial sync does not work with native pcb plugins
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP] Get requests with search paths on pcb can fail
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP][AMX] GSDM needs a ValueChangeType
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): [AMXB] protected objects are listed for public connection
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): [LCM] Error code is not forwarded correctly from LCM to USP in case of InstallDU using a non-existent EE
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): list operator using ubus backend without a path doesn't give a reply
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): list operator using ubus backend without a path doesn't give a reply
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): [ubus-cli] No alias paths in datamodel
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): [amxb_ubus]When calling a not existing method asynchronously no reply is given
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): When asking a parameter value in the cli, it returns more than expected.
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): [Ambiorix] Implement function call with search path
- [mod-sahtrace](https://gitlab.com/prpl-foundation/components/core/modules/mod-sahtrace): No traces in syslog when plug-in is started deamonized from ssh session

### Changes

- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): [PRPL] amxo-cg does not compile with libxml2 version 2.10.2
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Replace openwrt ASCII art by prplOS one

### Other

- [acl-manager](https://gitlab.com/prpl-foundation/components/ambiorix/applications/acl-manager): [KPN SW2][Security]Restrict ACL of guest user in Ambiorix datamodels
- [acl-manager](https://gitlab.com/prpl-foundation/components/ambiorix/applications/acl-manager): [KPN SW2][Security]Restrict ACL of guest user in Ambiorix datamodels
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): [amx-fcgi] generated datamodel documentation is empty
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Remove unneeded dependencies
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Fix a typo in the description of amxc_var_add_new_key_amxc_llist_t
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [amxo] Saving and restoring the odl (config) section gives errors.
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [odl] Regression conditional include does not take second if first is an empty directory
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): When odl includes an empty directory no error should be printed
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): Create the voice interface between ubus and pcb (tr104i1/2 mapper)
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [amx pcb]Not possible to retrieve list of parameters and functions of a template object
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP] Download() is handled synchronously
- [mod-dmext](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmext): - [amx][mod-dmext] Implement function csv_values_matches_regexp

## Release honister_v4.1.0 - 2023-04-12(16:38:32 +0000)

### New

- [lcmsampleapp](https://gitlab.com/prpl-foundation/): Component added

## Release honister_v4.0.4 - 2023-02-14(16:58:11 +0000)

## Release honister_v4.0.3 - 2023-02-10(22:50:22 +0000)

## Release honister_v4.0.1 - 2023-02-10(21:19:40 +0000)

## Release honister_v4.0.0 - 2023-02-09(18:27:43 +0000)

### Removed

- [libsahtrace](https://gitlab.com/prpl-foundation/components/core/libraries/libsahtrace): Component removed

## Release honister_v3.6.2 - 2023-02-09(18:12:09 +0000)

### Fixes

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): amx-fastcgi crashes at boot when webui is installed in LCM container
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): amx-fastcgi crashes at boot when webui is installed in LCM container
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP][CDROUTER] GetSupportedDM on Device.LocalAgent. using a single object, first_level_only true, all options presents no event
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP] Get requests starting with Device and containing a search path are failing on sop

## Release honister_v3.6.0 - 2023-02-06(15:15:18 +0000)

### New

- [libsahtrace](https://gitlab.com/prpl-foundation/components/core/libraries/libsahtrace): Component added

## Release honister_v3.5.2 - 2023-01-31(13:50:44 +0000)

## Release honister_v3.5.1 - 2023-01-31(12:28:03 +0000)

### Fixes

- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): [MQTT][USP] Overlapping reconnects can cause a segmentation fault
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Issue: semgrep reports

### Changes

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [USP] Requirements for Get changed
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [USP] Requirements for Get changed
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Issue NET-4423 [USP] Requirements for Get changed

### Other

- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): unblock a signal when disabling it with amxp_syssig_enable
- [lua-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/lua-amx): Add amxb_set_config support to lua bindings

## Release honister_v3.5.0 - 2023-01-30(12:00:38 +0000)

### New

- [python-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/python3): Add amxb_set_config support to python3 amx bindings

### Fixes

- [python-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/python3): [amx] Error when we try a second reboot

## Release honister_v3.4.0 - 2023-01-27(11:51:35 +0000)

### New

- [mod-dmext](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmext): [AMX] Write generic function for setting default parameter values

## Release honister_v3.3.7 - 2023-01-25(13:10:48 +0000)

## Release honister_v3.3.6 - 2023-01-25(00:29:51 +0000)

### Fixes

- [python-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/python3): Path to sut.dm.IP.Interface['3'].IPv4Address['1'].proxy() doenst work
- [python-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/python3): [amx] Unable to get data model object after a reboot

## Release honister_v3.3.5 - 2023-01-20(13:23:58 +0000)

### Fixes

- [amx-greeter-app](https://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/greeter_app): Issue: unit-test fails - Clean transaction object before re-using it
- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): [doc generation][NumberOfEntries field is not correctly put under the correct Object
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [AMXB] subscribing on different paths, still triggers all events cb
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [AMX][USP] A get on a protected parameter with public bus access must fail
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): An InstallDU call from USP is sometimes not called on SoftwareModules

### Other

- [lua-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/lua-amx): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected
- [lua-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/lua-amx): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

## Release honister_v3.3.4 - 2023-01-13(14:51:11 +0000)

### Fixes

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [ambiorix] [regression] transaction time is dependent on the number of parameters within the object

## Release honister_v3.3.3 - 2023-01-12(18:31:17 +0000)

## Release honister_v3.3.2 - 2023-01-12(10:42:10 +0000)

### Fixes

- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): [AMX] ACL directory must be updated for mod-ba-cli

## Release honister_v3.3.1 - 2023-01-11(22:41:51 +0000)

### Fixes

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [AMX][USP] Only filter objects when at least one parameter was filtered
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [AMX][USP] A get on a protected parameter with public bus access must fail
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [ambiorix] transaction time is dependent on the number of parameters within the object
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): 0-timeout timer postponed when starting another longer timer

## Release honister_v3.3.0 - 2023-01-02(16:23:18 +0000)

### New

- [lua-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/lua-amx): Component added
- [mod-lua-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/mod-lua-amx): Component added

## Release honister_v3.2.11 - 2022-12-20(01:36:16 +0000)

## Release honister_v3.2.10 - 2022-12-20(00:34:22 +0000)

### Fixes

- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): [amxrt] el_slot_wait_write_fd is added to late to signal `connection-wait-write`
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [multisettings] Using triggers is not effective
- [mod-dmext](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmext): Parameter with object reference to the same data model causes timeout

## Release honister_v3.2.6 - 2022-12-07(20:02:03 +0000)

## Release honister_v3.2.5 - 2022-12-07(19:28:45 +0000)

## Release honister_v3.2.4 - 2022-12-07(18:49:19 +0000)

## Release honister_v3.2.3 - 2022-12-07(18:39:29 +0000)

## Release honister_v3.2.2 - 2022-12-07(17:28:16 +0000)

## Release honister_v3.2.1 - 2022-12-07(11:51:14 +0000)

## Release honister_v3.2.0 - 2022-12-07(11:14:58 +0000)

### New

- [acl-manager](https://gitlab.com/prpl-foundation/components/ambiorix/applications/acl-manager): [ACLManager] Create ACL user to handle secure acl checking

### Fixes

- [acl-manager](https://gitlab.com/prpl-foundation/components/ambiorix/applications/acl-manager): Clean up code
- [acl-manager](https://gitlab.com/prpl-foundation/components/ambiorix/applications/acl-manager): Issue: verify return value of chown
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Fix wrong usage of function amxd_path_setf
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [USP] Allow invoking commands without braces
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Fix wrong usage of function amxd_path_setf
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Issue #147 Add and update documentation for amxd_path API
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Add instance response is wrong when using key path notation on ubus
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Fix wrong usage of function amxd_path_setf

### Other

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Fix some typos in the documentation

## Release honister_v3.1.1 - 2022-12-06(18:55:03 +0000)

### Fixes

- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): amxp_expr_buildf with 2 arguments only works in container, not on board

## Release honister_v3.1.0 - 2022-12-06(15:24:34 +0000)

### New

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [ACLManager] Create ACL user to handle secure acl checking
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [AMX] Extend libamxa for easier verification of RPC methods
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Add comparison implementation for htable variants
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc):  Add comparison implementation for linked list variants
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Add function to retrieve parameter path
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Add directory utility functions
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Component added
- [mod-dmext](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmext): Add validator for check_is_empty_or_in
- [python-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/python3): Component added

### Fixes

- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): Ignore deprecated declarations
- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): Files passed with -i option are not handled as include files
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): Invalid ACL file must result in an error
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): Investigate and fix klocwork reports for ambiorix libs and tools
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Asynchonous call on local deferred function does not fill retval
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Make it possible to wait for instances
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Issue: Investigate and fix klocwork reports
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Update documentation of functions amxc_var_get_next, amxc_var_get_previous and amxc_var_get_parent
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Converting an empty string variant to a list should result in an empty list
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Fix wrong comma in amxc_var_dump output
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Investigate and fix klocwork reports for ambiorix libs and tools
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Parameter attributes are not correctly checked when adding the parameter to an object
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Do not use expression to filter parameters on name or attributes
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Issue: Fix _describe RPC method definition
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [USP][CDROUTER] GetSupportedDMResp presents wrong syntax of inner nested multi-instanceobject
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): GSDM should return read-only attribute for key parameters
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Investigate and fix klocwork reports for ambiorix libs and tools
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [AMX] Get with search path returns too many results
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [AMX] Missing functions in GSDM response
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [AMX] Missing functions in GSDM response
- [libamxj](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxj): [AMX] JSON string cannot be sent as event data
- [libamxm](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxm): Investigate and fix klocwork reports for ambiorix libs and tools
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): It mustbe possible to define empty object or empty array in config section
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Write errors and warning to system log
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [USP][CDROUTER] GetSupportedDM on Device.LocalAgent. using a single object, first_level_only true, all options presents no event
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Apply change owner when uid or gid is different from zero
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): When signals are triggered in a recursive way it can lead to segfaults
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Compile regular expressions and validate expressions only once
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Investigate and fix klocwork reports for ambiorix libs and tools
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Key parameters must be added to add instance reply
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Get request with invalid path should fail
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Improve wait for and subscribe functionality
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Segmentation fault when stopping process
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Issue: Fix failing unit tests for set multiple
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP][CDROUTER] GetSupportedDM on Device.LocalAgent. using a single object, first_level_only true, all options presents no event
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [ACLManager]Crash when accessing pcb with user anonymous
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): GSDM should return read-only attribute for key parameters
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [AMX] JSON string cannot be sent as event data
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [AMX] Missing functions in GSDM response
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [AMX] Missing functions in GSDM response
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Wrong configuration is passed to back-ends when connecting
- [mod-sahtrace](https://gitlab.com/prpl-foundation/components/core/modules/mod-sahtrace): [SAHTrace] Use new syntax to prevent ubus config overwrite

### Changes

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Re-add demo/example web-ui
- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): Use amxp functions for scanning directories
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Auto detect usp sockets
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Use amxp functions for creating and scanning directories
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [ACS][V12] Setting of VOIP in a single SET does not enable VoiceProfile
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [ACS][V12] Setting of VOIP in a single SET does not enable VoiceProfile
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [ACS][V12] Setting of VOIP in a single SET does not enable VoiceProfile
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [ACS][V12] Setting of VOIP in a single SET does not enable VoiceProfile
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [USP] Add requests with search paths will be allowed
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): It must be possible for a function resolver to known for which action an action callback function is needed
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): Reduce the amount of amxb calls for copy parameters
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP] Add requests with search paths will be allowed
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): [AMX] Dump output arguments of failed methods

### Other

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Improve plugin boot order
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Remove configuration for lighttpd
- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): Issue: ambiorix/applications/amxo-cg#21 Variant return type is not properly converted to doc
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Implement reboot/upgrade persistence for Ambiorix objects
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Support appending formatted string with safety check on replacements
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Issue: ambiorix/libraries/libamxc#69 Remove dead code and code cleanup
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Add new error code amxd_status_not_supported
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [USP][CDROUTER] GetSupportedDM on Device.LocalAgent. using a single object, first_level_only true, all options presents no event
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [AMX] Improve documentation of amxd_object function with regard to events
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [AMX] Improve documentation of amxd_object function with regard to events
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Issue: ambiorix/libraries/libamxd#148 Add new error code amxd_status_not_supported
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Add ^= expression operator
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Add function to check if string is safe to build expressions with
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP][CDROUTER] GetSupportedDMResp presents wrong syntaxe of inner nested multi-instanceobject
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): [USP][CDROUTER] GetSupportedDM on Device.LocalAgent. using a single object, first_level_only true, all options presents no event

## Release honister_v3.0.0 - 2022-09-27(09:42:17 +0000)

### Removed

- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Component removed

### New

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): Add public function to check if getting a parameter is allowed
- [mod-dmext](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmext): Component added
- [mod-sahtrace](https://gitlab.com/prpl-foundation/components/core/modules/mod-sahtrace): Component added

### Fixes

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Issue: HOP-1897- [UI] UI broken on WNC config
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): amxc_string_t does not handle empty strings properly
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP][CDROUTER] USP Agent never sent a notification to the controller
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP][CDROUTER] The agent sends the GetSupportedDMResp with missing "Device" when requested single object "Device.localAgent."

### Changes

- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): [USP] Location of odl save files needs to change
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Support Ambiorix access restriction from PCB bus, NET-3484 [PCB][AMX][ACL] It must be possible to apply ACLS on amx components in a PCB environment
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): [USP] Add requests with search paths will be allowed

### Other

- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Integrate Devolo Interference Mitigation (integration)
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): libamxo build failed because when_true_status() macro is redefined.

## Release honister_v2.6.3 - 2022-09-13(12:08:30 +0000)

### Changes

- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Set config variant before connecting to back-end

## Release honister_v2.6.2 - 2022-09-13(12:06:43 +0000)

### Fixes

- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [AMX] Allow back-ends to modify their config section

## Release honister_v2.6.1 - 2022-09-13(12:03:11 +0000)

### Fixes

- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): [AMX] Allow back-ends to modify their config section

## Release honister_v2.6.0 - 2022-09-13(12:01:34 +0000)

### New

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Add implementation for seBatch

### Fixes

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Issue: Unit tests for send-events are failing

### Other

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Rework configuration to work with default lighttpd
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Use amxa_get to avoid code duplications

## Release honister_v2.5.3 - 2022-09-13(11:59:32 +0000)

### Fixes

- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): no-colors should be set to true by default
- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

## Release honister_v2.5.2 - 2022-09-13(11:56:55 +0000)

### Fixes

- [amxo-xml-to](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to): Update the date in the html template to 2022
- [amxo-xml-to](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to): Broken reference to mibs in html pages

### Changes

- [amxo-xml-to](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to): It must be possible to customize style sheet, title and copyright notice in html

### Other

- [amxo-xml-to](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when...

## Release honister_v2.5.1 - 2022-09-13(11:53:31 +0000)

## Release honister_v2.5.0 - 2022-09-13(11:47:40 +0000)

### New

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): Implement amxa_set_multiple

### Fixes

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): amxa_get() should return -1 when no access rights

### Other

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [ACL manager] Update documentation for the acl manager in confluence
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): Issue: ambiorix/libraries/libamxa#24 Implement amxa_get

## Release honister_v2.4.6 - 2022-09-13(11:42:52 +0000)

### Fixes

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [AMX] Allow back-ends to modify their config section

## Release honister_v2.4.5 - 2022-09-13(11:40:29 +0000)

### Fixes

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): amx gmap-client modules do not wait for "requires"

## Release honister_v2.4.4 - 2022-09-13(11:32:28 +0000)

## Release honister_v2.4.3 - 2022-09-13(10:37:04 +0000)

## Release honister_v2.4.2 - 2022-09-13(10:34:47 +0000)

## Release honister_v2.4.1 - 2022-09-13(10:30:40 +0000)

## Release honister_v2.4.0 - 2022-09-13(10:27:46 +0000)

### New

- [acl-manager](https://gitlab.com/prpl-foundation/components/ambiorix/applications/acl-manager): Component added
- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): Component added
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Component added
- [amxo-xml-to](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to): Component added
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): Component added
- [libamxs](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxs): Component added
- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Component added
- [mod-dm-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-dm-cli): Component added

### Fixes

- [libamxj](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxj): Due to change in libamxc a unit test is failing

## Release honister_v2.3.26 - 2022-08-24(12:24:29 +0000)

### Fixes

- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP] TransferComplete! event does not have a Device. prefix

## Release honister_v2.3.25 - 2022-08-24(12:01:41 +0000)

## Release honister_v2.3.24 - 2022-08-24(10:18:19 +0000)

### Fixes

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Performing an amxb_async_call on a local deferred data model method doesn't return correctly

## Release honister_v2.3.23 - 2022-08-24(10:02:01 +0000)

### Fixes

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [amx] custom param read handler called more often than expected

## Release honister_v2.3.22 - 2022-08-24(09:44:02 +0000)

### Fixes

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [amx] custom param read handler called more often than expected

## Release honister_v2.3.21 - 2022-08-18(17:03:50 +0000)

## Release honister_v2.3.20 - 2022-08-18(16:47:42 +0000)

## Release honister_v2.3.19 - 2022-08-18(14:03:40 +0000)

## Release honister_v2.3.18 - 2022-08-18(13:59:29 +0000)

### Changes

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [GL-B1300] Various components failing to open Service in firewall due to high load and multiple interface toggling

## Release honister_v2.3.17 - 2022-08-18(13:36:06 +0000)

## Release honister_v2.3.16 - 2022-08-18(13:18:28 +0000)

## Release honister_v2.3.15 - 2022-08-18(13:03:20 +0000)

### Changes

- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [GL-B1300] Various components failing to open Service in firewall due to high load and multiple interface toggling

## Release honister_v2.3.14 - 2022-08-17(13:24:24 +0000)

## Release honister_v2.3.13 - 2022-08-17(13:14:28 +0000)

### Changes

- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Issue: Update ubus capabilities

## Release honister_v2.3.12 - 2022-08-17(10:45:57 +0000)

### Fixes

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [USP] MQTT IMTP connection cannot handle bus requests

## Release honister_v2.3.11 - 2022-08-17(10:19:39 +0000)

### Fixes

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): It must be possible to extend composite config options

## Release honister_v2.3.10 - 2022-08-17(09:55:07 +0000)

## Release honister_v2.3.9 - 2022-08-17(09:49:44 +0000)

### Fixes

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): allow_partial is not set as an input argument for the set operation

## Release honister_v2.3.8 - 2022-08-17(08:52:07 +0000)

## Release honister_v2.3.7 - 2022-08-17(08:44:17 +0000)

## Release honister_v2.3.6 - 2022-08-17(08:35:01 +0000)

## Release honister_v2.3.5 - 2022-08-17(08:15:25 +0000)

### Changes

- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): amxc_string_split_to_llist not splitting text with newline sperator.

## Release honister_v2.3.4 - 2022-08-16(11:46:57 +0000)

### Fixes

- [amx-tr181-localagent-threshold](https://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/localagent_threshold): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

## Release honister_v2.3.3 - 2022-08-16(11:32:58 +0000)

### Fixes

- [amx-htable-contacts](https://gitlab.com/prpl-foundation/components/ambiorix/examples/collections/htable_contacts): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

## Release honister_v2.3.2 - 2022-08-16(11:29:05 +0000)

### Other

- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when...

## Release honister_v2.3.1 - 2022-08-16(11:24:28 +0000)

### Fixes

- [amx-subscribe](https://gitlab.com/prpl-foundation/components/ambiorix/examples/baapi/subscribe): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

## Release honister_v2.3.0 - 2022-08-16(11:20:48 +0000)

### New

- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Commandline options -o and -F must support configuration paths and json data
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): When there are required objects events can appear before the entry points are called

### Fixes

- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Adds yajl as dependency in baf
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Fixes regression
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Plug-in name is not correctly passed to pcb back-end
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Load order must be the same as save order
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): When amxrt is stopped while waiting for required objects the entrypoints should not be called with reason STOP
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Changes for hop-1509 causes regressions
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Plugins not starting at boot
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): amxrt fails to create folder
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Link amxrt with libyajl

### Changes

- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Plugins not starting at boot

## Release honister_v2.2.0 - 2022-08-15(19:48:06 +0000)

### New

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Add permission denied status code
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Add API to get applied mib names
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Add internal data model RPC _get_instances

### Fixes

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Use dyncast to get the index out of a variant
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Aliases containing dots causes problems when used in object paths
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Remove macro IS_SET
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): It is not possible to add multiple times the same object action callback with different private data
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): The default rpc _get must be able to support parameter paths
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Supported commands under multi-instance objects are not returned
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Set amxd_object_free as public API method
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [amx] certain NumberOfEntries fields not updated

### Changes

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Update get supported data model implementation according to USP specification 1.2
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Update path parser to be able to detect reference path
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Add reference following for reference lists using indexes
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Add support for mutable keys
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Make it possible to read hidden values depending on the access level
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [MQTT] Topic must be writable after creation

### Other

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Issue: ambiorix/libraries/libamxd#125 Update documentation on return variant of transaction
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Issue: ambiorix/libraries/libamxd#141 Default object write action fails when only setting optional parameters

## Release honister_v2.1.2 - 2022-08-15(18:59:36 +0000)

### Fixes

- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): A quoted string must always be interpreted as a string
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): The command parser does not parse embedded string correctly

## Release honister_v2.1.1 - 2022-08-15(18:57:58 +0000)

### Fixes

- [libamxm](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxm): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

## Release honister_v2.1.0 - 2022-08-15(18:55:18 +0000)

### New

- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): It must be possible to suspend handling of signals for a specific signal manager

### Other

- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [amx] crash on amxp signal read
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when...

## Release honister_v2.0.0 - 2022-08-15(18:40:05 +0000)

### Breaking

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Remove deprecated functions
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Add support for allow partial with set operator

### New

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Implement amxb_get_multiple
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Implement amxb_set_multiple
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Add support for get_instances operator
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Add implementation of amxc_var_set_path and amxc_var_set_pathf
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Make it possible to initialize a timestamp structure using struct tm

### Fixes

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Fixes test version cehcking
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Fixes version check test due to upstep of major version
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Constructor functions that add custom expression function must be run at level higher then 101
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Incorrect check for get_instances back-end function
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Reference following using key addressing fails
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Invoke of method with out arguments on local data model creates wrong result variant
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

### Changes

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Adds lookup cache for amxb_who_has
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Use reference index when a reference path is provided
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [Ambiorix] Implementation of reference following decorator

### Other

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Issue: ambiorix/libraries/libamxb#63 Doxygen documentation tags must be added to back-end interface stuct and function signatures
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Improve documentation
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Add when_failed_status macro

## Release honister_v1.1.1 - 2022-08-15(18:34:06 +0000)

### Fixes

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Update implementation of amxo_parser_get_config, amxo_parser_set_config, amxo_parser_claim_config
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): ODL parser sometimes gets confused
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [amxo-cg] segfault when parsing long comments
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Run tests with sah-ci image

### Changes

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Add support for mutable keys

### Other

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Update documentation on AMXO_ODL_LOADED
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Issue: ambiorix/libraries/libamxo#72 Update documentation on AMXO_ODL_LOADED
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Issue: ambiorix/libraries/libamxo#76 The object write  action is not called during parsing of odl files

## Release honister_v1.1.0 - 2022-08-12(08:26:17 +0000)

### New

- [amxb-inspect](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxb-inspect): Check get_instances function of back-end

### Fixes

- [amx-greeter-app](https://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/greeter_app): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Segmentation fault when amxb_ubus_list is called with invalid path
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): uBus does not always respect order of in-coming messages
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Send reply in case of an error
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): [Ambiorix] Unit tests for amxb_ubus report memory leak
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

### Other

- [amx-greeter-plugin](https://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/greeter_plugin): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when...
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Update ubus dependency

## Release honister_v1.0.0 - 2022-08-11(23:53:48 +0000)

### Breaking

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [prplOS][ambiorix] Several component failing to start on NEC mips xrx500 target
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Update set interface according to changes in libamxb

### New

- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Implement pcb backend function for get instances operator on PCB data models

### Fixes

- [amx-llist-contacts](https://gitlab.com/prpl-foundation/components/ambiorix/examples/collections/llist_contacts): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected
- [amx-variant-contacts](https://gitlab.com/prpl-foundation/components/ambiorix/examples/collections/variant_contacts): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Variant conversions to integer values is going wrong on mips target
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Cannot load unknown instance parameter with "populate-behavior.unknown-parameter=add"
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Copybara replaces too many lib occurences
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Make it possible to do partial sets on native PCB data models
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): When using amxb_set_multiple without required parameters the return value is incorrect
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Segmentation fault when amxb_pcb_list is called with invalid path
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): When subscribing on root object of mapped pcb datamodel no events are received
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP] Unable to invoke FirmwareImage Download() command
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

### Changes

- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Make it possible to do partial sets on native PCB data models
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Update get supported data model implementation according to USP specification 1.2

### Other

- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Add missing dependency to libpcb
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): USP needs async userflags for functions
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Sort objects before building GSDM response

## Release honister_v0.1.0 - 2022-08-02(09:41:04 +0000)

### New

- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): Component added
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Component added
- [amx-greeter-app](https://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/greeter_app): Component added
- [amx-greeter-plugin](https://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/greeter_plugin): Component added
- [amx-htable-contacts](https://gitlab.com/prpl-foundation/components/ambiorix/examples/collections/htable_contacts): Component added
- [amx-llist-contacts](https://gitlab.com/prpl-foundation/components/ambiorix/examples/collections/llist_contacts): Component added
- [amx-subscribe](https://gitlab.com/prpl-foundation/components/ambiorix/examples/baapi/subscribe): Component added
- [amx-tr181-localagent-threshold](https://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/localagent_threshold): Component added
- [amx-variant-contacts](https://gitlab.com/prpl-foundation/components/ambiorix/examples/collections/variant_contacts): Component added
- [amxb-inspect](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxb-inspect): Component added
- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): Component added
- [amxo-xml-to](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to): Component added
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Component added
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): Component added
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Component added
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Component added
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Component added
- [libamxj](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxj): Component added
- [libamxm](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxm): Component added
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Component added
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Component added
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): Component added
- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Component added
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Component added

## Release v1.15.0 - 2021-12-14(16:15:31 +0000)

### New

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Add support for allow partial in set operator
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): Component added
- [amxo-xml-to](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to): Component added
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Component added
- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): Component added

### Fixes

- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Subscriptions on non-existing objects must fail
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Memory leak in amxb_ubus_get_longest_path when invoked with a non existing path
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Use emit signal instead of trigger in amxb_ubus_wait_watcher
- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Amxb_ubus_unsubscribe segfaults when object is not found
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Fixes regression due to adding any action
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Missing brackets in function resolver data causes segmentation fault
- [libamxj](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxj): Potential memory leak in variant_json_init
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Documentation mentions wrong type for object iterations macros
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Improve default set action
- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): Fixes test when daylight saving is off
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): amxb_who_has function must take local data model into account
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): No events received when subscribing on native ubus objects
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Fixes subscription on search paths
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Fixes segmentation fault when deleting subscription object
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Fixes compilation issue for g++
- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): amxo-cg crashes when trying to parse prplMesh ODL files

### Changes

- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Adds support for event proxy
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): When signal is deleted in slot, the remaining slots must be called
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): Make it possible to set an action callback for all actions
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): The function name must be passed as private data to subscriptions taken from an odl file
- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): ODL parser should pass function type to resolvers
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): When a parameter is of csv or ssv type all individual values must be verified with check_enum or check_is_in
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Make it possible to set relative parameter references in validators
- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Improve and refactor subscriptions
- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): Make it possible to handle data model events before app:start event is triggered

### Other

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Issue: ambiorix/libraries/libamxb#47 When unsubscribing slot disconnect must be done on a specific signal
- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): Issue: ambiorix/applications/amxo-cg#20 Add STAGINGDIR to CFLAGS and LDFLAGS

## Release v1.14.0 - 2021-11-04(15:35:24 +0000)

### New

- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): It must be possible to connect to uris without registering a data model

### Fixes

- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): Fixes events from PCB mapper data models
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): Restarting timers can lead to early sigalrm
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Infinite loop when removing parent object having underlying depth greater than 10
- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): Amxd_object:remove_mib removes mibs when they are not added

