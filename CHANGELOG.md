# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]


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

