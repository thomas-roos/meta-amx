# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]


## Release gen_honister_v3.3.0 - 2023-01-02(16:23:18 +0000)

### New

- [lua-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/lua-amx): Component added
- [mod-lua-amx](https://gitlab.com/prpl-foundation/components/ambiorix/bindings/lua/mod-lua-amx): Component added

## Release gen_honister_v3.2.11 - 2022-12-20(01:36:16 +0000)

## Release gen_honister_v3.2.10 - 2022-12-20(00:34:22 +0000)

### Fixes

- [amxrt](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxrt): [amxrt] el_slot_wait_write_fd is added to late to signal `connection-wait-write`
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [multisettings] Using triggers is not effective
- [mod-dmext](https://gitlab.com/prpl-foundation/components/core/modules/mod-dmext): Parameter with object reference to the same data model causes timeout

## Release gen_honister_v3.2.6 - 2022-12-07(20:02:03 +0000)

## Release gen_honister_v3.2.5 - 2022-12-07(19:28:45 +0000)

## Release gen_honister_v3.2.4 - 2022-12-07(18:49:19 +0000)

## Release gen_honister_v3.2.3 - 2022-12-07(18:39:29 +0000)

## Release gen_honister_v3.2.2 - 2022-12-07(17:28:16 +0000)

## Release gen_honister_v3.2.1 - 2022-12-07(11:51:14 +0000)

## Release gen_honister_v3.2.0 - 2022-12-07(11:14:58 +0000)

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

## Release gen_honister_v3.1.1 - 2022-12-06(18:55:03 +0000)

### Fixes

- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): amxp_expr_buildf with 2 arguments only works in container, not on board

## Release gen_honister_v3.1.0 - 2022-12-06(15:24:34 +0000)

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

## Release gen_honister_v3.0.0 - 2022-09-27(09:42:17 +0000)

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

## Release gen_honister_v2.6.3 - 2022-09-13(12:08:30 +0000)

### Changes

- [mod-ba-cli](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amx_cli/mod-ba-cli): Set config variant before connecting to back-end

## Release gen_honister_v2.6.2 - 2022-09-13(12:06:43 +0000)

### Fixes

- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [AMX] Allow back-ends to modify their config section

## Release gen_honister_v2.6.1 - 2022-09-13(12:03:11 +0000)

### Fixes

- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): [AMX] Allow back-ends to modify their config section

## Release gen_honister_v2.6.0 - 2022-09-13(12:01:34 +0000)

### New

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Add implementation for seBatch

### Fixes

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Issue: Unit tests for send-events are failing

### Other

- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Rework configuration to work with default lighttpd
- [amx-fcgi](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-fcgi): Use amxa_get to avoid code duplications

## Release gen_honister_v2.5.3 - 2022-09-13(11:59:32 +0000)

### Fixes

- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): no-colors should be set to true by default
- [amx-cli](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amx-cli): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

## Release gen_honister_v2.5.2 - 2022-09-13(11:56:55 +0000)

### Fixes

- [amxo-xml-to](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to): Update the date in the html template to 2022
- [amxo-xml-to](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to): Broken reference to mibs in html pages

### Changes

- [amxo-xml-to](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to): It must be possible to customize style sheet, title and copyright notice in html

### Other

- [amxo-xml-to](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-xml-to): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when...

## Release gen_honister_v2.5.1 - 2022-09-13(11:53:31 +0000)

## Release gen_honister_v2.5.0 - 2022-09-13(11:47:40 +0000)

### New

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): Implement amxa_set_multiple

### Fixes

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): amxa_get() should return -1 when no access rights

### Other

- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): [ACL manager] Update documentation for the acl manager in confluence
- [libamxa](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxa): Issue: ambiorix/libraries/libamxa#24 Implement amxa_get

## Release gen_honister_v2.4.6 - 2022-09-13(11:42:52 +0000)

### Fixes

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [AMX] Allow back-ends to modify their config section

## Release gen_honister_v2.4.5 - 2022-09-13(11:40:29 +0000)

### Fixes

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): amx gmap-client modules do not wait for "requires"

## Release gen_honister_v2.4.4 - 2022-09-13(11:32:28 +0000)

## Release gen_honister_v2.4.3 - 2022-09-13(10:37:04 +0000)

## Release gen_honister_v2.4.2 - 2022-09-13(10:34:47 +0000)

## Release gen_honister_v2.4.1 - 2022-09-13(10:30:40 +0000)

## Release gen_honister_v2.4.0 - 2022-09-13(10:27:46 +0000)

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

## Release gen_honister_v2.3.26 - 2022-08-24(12:24:29 +0000)

### Fixes

- [mod-amxb-pcb](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_pcb): [USP] TransferComplete! event does not have a Device. prefix

## Release gen_honister_v2.3.25 - 2022-08-24(12:01:41 +0000)

## Release gen_honister_v2.3.24 - 2022-08-24(10:18:19 +0000)

### Fixes

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): Performing an amxb_async_call on a local deferred data model method doesn't return correctly

## Release gen_honister_v2.3.23 - 2022-08-24(10:02:01 +0000)

### Fixes

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [amx] custom param read handler called more often than expected

## Release gen_honister_v2.3.22 - 2022-08-24(09:44:02 +0000)

### Fixes

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): [amx] custom param read handler called more often than expected

## Release gen_honister_v2.3.21 - 2022-08-18(17:03:50 +0000)

## Release gen_honister_v2.3.20 - 2022-08-18(16:47:42 +0000)

## Release gen_honister_v2.3.19 - 2022-08-18(14:03:40 +0000)

## Release gen_honister_v2.3.18 - 2022-08-18(13:59:29 +0000)

### Changes

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): [GL-B1300] Various components failing to open Service in firewall due to high load and multiple interface toggling

## Release gen_honister_v2.3.17 - 2022-08-18(13:36:06 +0000)

## Release gen_honister_v2.3.16 - 2022-08-18(13:18:28 +0000)

## Release gen_honister_v2.3.15 - 2022-08-18(13:03:20 +0000)

### Changes

- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [GL-B1300] Various components failing to open Service in firewall due to high load and multiple interface toggling

## Release gen_honister_v2.3.14 - 2022-08-17(13:24:24 +0000)

## Release gen_honister_v2.3.13 - 2022-08-17(13:14:28 +0000)

### Changes

- [mod-amxb-ubus](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_ubus): Issue: Update ubus capabilities

## Release gen_honister_v2.3.12 - 2022-08-17(10:45:57 +0000)

### Fixes

- [libamxb](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxb): [USP] MQTT IMTP connection cannot handle bus requests

## Release gen_honister_v2.3.11 - 2022-08-17(10:19:39 +0000)

### Fixes

- [libamxo](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxo): It must be possible to extend composite config options

## Release gen_honister_v2.3.10 - 2022-08-17(09:55:07 +0000)

## Release gen_honister_v2.3.9 - 2022-08-17(09:49:44 +0000)

### Fixes

- [libamxd](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxd): allow_partial is not set as an input argument for the set operation

## Release gen_honister_v2.3.8 - 2022-08-17(08:52:07 +0000)

## Release gen_honister_v2.3.7 - 2022-08-17(08:44:17 +0000)

## Release gen_honister_v2.3.6 - 2022-08-17(08:35:01 +0000)

## Release gen_honister_v2.3.5 - 2022-08-17(08:15:25 +0000)

### Changes

- [libamxc](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxc): amxc_string_split_to_llist not splitting text with newline sperator.

## Release gen_honister_v2.3.4 - 2022-08-16(11:46:57 +0000)

### Fixes

- [amx-tr181-localagent-threshold](https://gitlab.com/prpl-foundation/components/ambiorix/examples/datamodel/localagent_threshold): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

## Release gen_honister_v2.3.3 - 2022-08-16(11:32:58 +0000)

### Fixes

- [amx-htable-contacts](https://gitlab.com/prpl-foundation/components/ambiorix/examples/collections/htable_contacts): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

## Release gen_honister_v2.3.2 - 2022-08-16(11:29:05 +0000)

### Other

- [amxo-cg](https://gitlab.com/prpl-foundation/components/ambiorix/applications/amxo-cg): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when...

## Release gen_honister_v2.3.1 - 2022-08-16(11:24:28 +0000)

### Fixes

- [amx-subscribe](https://gitlab.com/prpl-foundation/components/ambiorix/examples/baapi/subscribe): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

## Release gen_honister_v2.3.0 - 2022-08-16(11:20:48 +0000)

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

## Release gen_honister_v2.2.0 - 2022-08-15(19:48:06 +0000)

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

## Release gen_honister_v2.1.2 - 2022-08-15(18:59:36 +0000)

### Fixes

- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): A quoted string must always be interpreted as a string
- [libamxt](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxt): The command parser does not parse embedded string correctly

## Release gen_honister_v2.1.1 - 2022-08-15(18:57:58 +0000)

### Fixes

- [libamxm](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxm): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when memory leaks are detected

## Release gen_honister_v2.1.0 - 2022-08-15(18:55:18 +0000)

### New

- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): It must be possible to suspend handling of signals for a specific signal manager

### Other

- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [amx] crash on amxp signal read
- [libamxp](https://gitlab.com/prpl-foundation/components/ambiorix/libraries/libamxp): [Gitlab CI][Unit tests][valgrind] Pipeline doesn't stop when...

## Release gen_honister_v2.0.0 - 2022-08-15(18:40:05 +0000)

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

## Release gen_honister_v1.1.1 - 2022-08-15(18:34:06 +0000)

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

## Release gen_honister_v1.1.0 - 2022-08-12(08:26:17 +0000)

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

## Release gen_honister_v1.0.0 - 2022-08-11(23:53:48 +0000)

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

## Release gen_honister_v0.1.0 - 2022-08-02(09:41:04 +0000)

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

