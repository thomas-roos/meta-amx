/****************************************************************************
**
** Copyright (c) 2023 SoftAtHome
**
** Redistribution and use in source and binary forms, with or
** without modification, are permitted provided that the following
** conditions are met:
**
** 1. Redistributions of source code must retain the above copyright
** notice, this list of conditions and the following disclaimer.
**
** 2. Redistributions in binary form must reproduce the above
** copyright notice, this list of conditions and the following
** disclaimer in the documentation and/or other materials provided
** with the distribution.
**
** Subject to the terms and conditions of this license, each
** copyright holder and contributor hereby grants to those receiving
** rights under this license a perpetual, worldwide, non-exclusive,
** no-charge, royalty-free, irrevocable (except for failure to
** satisfy the conditions of this license) patent license to make,
** have made, use, offer to sell, sell, import, and otherwise
** transfer this software, where such license applies only to those
** patent claims, already acquired or hereafter acquired, licensable
** by such copyright holder or contributor that are necessarily
** infringed by:
**
** (a) their Contribution(s) (the licensed copyrights of copyright
** holders and non-copyrightable additions of contributors, in
** source or binary form) alone; or
**
** (b) combination of their Contribution(s) with the work of
** authorship to which such Contribution(s) was added by such
** copyright holder or contributor, if, at the time the Contribution
** is added, such addition causes such combination to be necessarily
** infringed. The patent license shall not apply to any other
** combinations which include the Contribution.
**
** Except as expressly stated above, no rights or licenses from any
** copyright holder or contributor is granted under this license,
** whether expressly, by implication, estoppel or otherwise.
**
** DISCLAIMER
**
** THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
** CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
** INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
** MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
** DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR
** CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
** SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
** LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
** USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
** AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
** LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
** ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
** POSSIBILITY OF SUCH DAMAGE.
**
****************************************************************************/

#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <inttypes.h>

#include <debug/sahtrace.h>

#include "sample_app.h"

#define ME "methods"

#define DUMMYGLOBALINT "DummyGlobalInt"
#define DUMMYGLOBALSTRING "DummyGlobalString"
#define DUMMYMULTIINSTANCE "DummyMultiInstance"

amxd_status_t _LCMSampleApp_dummycmd(UNUSED amxd_object_t* lcmsampleapp,
                                     UNUSED amxd_function_t* func,
                                     amxc_var_t* args,
                                     amxc_var_t* ret) {
    amxd_status_t status = amxd_status_unknown_error;
    bool retval = false;
    amxc_var_t* returnvalue = GET_ARG(args, "returnvalue");
    if(returnvalue) {
        retval = amxc_var_dyncast(bool, returnvalue);
        status = amxd_status_ok;
    }

    amxc_var_set(bool, ret, retval);
    return status;
}

amxd_status_t _LCMSampleApp_setDummyGlobalInt(amxd_object_t* lcmsampleapp,
                                              UNUSED amxd_function_t* func,
                                              amxc_var_t* args,
                                              amxc_var_t* ret) {
    amxd_status_t status = amxd_status_unknown_error;
    amxc_var_t* value = GET_ARG(args, "value");
    uint32_t prevval = amxd_object_get_value(uint32_t, lcmsampleapp, DUMMYGLOBALINT, NULL);
    uint32_t val;

    if(value) {
        val = amxc_var_dyncast(uint32_t, value);
        SAH_TRACEZ_INFO(ME, "Wanna set " DUMMYGLOBALINT " to '%" PRIu32 "'", val);

        if(val != prevval) {
            amxd_dm_t* dm = sample_app_get_dm();
            if(dm) {
                amxd_trans_t transaction;
                amxd_trans_init(&transaction);
                amxd_trans_select_object(&transaction, lcmsampleapp);
                amxd_trans_set_param(&transaction, DUMMYGLOBALINT, value);
                status = amxd_trans_apply(&transaction, dm);
                amxd_trans_clean(&transaction);
            }
        } else {
            status = amxd_status_ok;
        }
    }

    if(status == amxd_status_ok) {
        SAH_TRACEZ_INFO(ME, "Succesfully set " DUMMYGLOBALINT "to %" PRIu32 "'", val);
        amxc_var_set(uint32_t, ret, val);
    } else {
        SAH_TRACEZ_ERROR(ME, "Did not set " DUMMYGLOBALINT " so we keep it on '%" PRIu32 "'", prevval);
        amxc_var_set(uint32_t, ret, prevval);
    }

    return status;
}

amxd_status_t _LCMSampleApp_getDummyGlobalInt(amxd_object_t* lcmsampleapp,
                                              UNUSED amxd_function_t* func,
                                              UNUSED amxc_var_t* args,
                                              amxc_var_t* ret) {
    uint32_t val = amxd_object_get_value(uint32_t, lcmsampleapp, DUMMYGLOBALINT, NULL);
    amxc_var_set(uint32_t, ret, val);
    return amxd_status_ok;
}

amxd_status_t _LCMSampleApp_setDummyGlobalString(amxd_object_t* lcmsampleapp,
                                                 UNUSED amxd_function_t* func,
                                                 amxc_var_t* args,
                                                 amxc_var_t* ret) {
    amxd_status_t status = amxd_status_unknown_error;
    amxc_var_t* value = GET_ARG(args, "value");
    char* prevval = amxd_object_get_value(cstring_t, lcmsampleapp, DUMMYGLOBALSTRING, NULL);
    char* val = NULL;

    if(value) {
        val = amxc_var_dyncast(cstring_t, value);
        SAH_TRACEZ_INFO(ME, "Wanna set " DUMMYGLOBALSTRING " to '%s'", val);

        if(strcmp(prevval, val) != 0) {
            amxd_dm_t* dm = sample_app_get_dm();
            if(dm) {
                amxd_trans_t transaction;
                amxd_trans_init(&transaction);
                amxd_trans_select_object(&transaction, lcmsampleapp);
                amxd_trans_set_param(&transaction, DUMMYGLOBALSTRING, value);
                status = amxd_trans_apply(&transaction, dm);
                amxd_trans_clean(&transaction);
            }
        } else {
            status = amxd_status_ok;
        }
    }

    if(status == amxd_status_ok) {
        SAH_TRACEZ_INFO(ME, "Succesfully set " DUMMYGLOBALSTRING "to '%s'", val);
        amxc_var_set(cstring_t, ret, val);
    } else {
        SAH_TRACEZ_ERROR(ME, "Did not set " DUMMYGLOBALSTRING " so we keep it on '%s'", prevval);
        amxc_var_set(cstring_t, ret, prevval);
    }

    if(val) {
        free(val);
    }
    free(prevval);
    return status;
}

amxd_status_t _LCMSampleApp_getDummyGlobalString(amxd_object_t* lcmsampleapp,
                                                 UNUSED amxd_function_t* func,
                                                 UNUSED amxc_var_t* args,
                                                 amxc_var_t* ret) {
    char* val = amxd_object_get_value(cstring_t, lcmsampleapp, DUMMYGLOBALSTRING, NULL);
    amxc_var_set(cstring_t, ret, val);
    return amxd_status_ok;
}

amxd_status_t _LCMSampleApp_clearDummyInstances(amxd_object_t* lcmsampleapp,
                                                UNUSED amxd_function_t* func,
                                                amxc_var_t* args,
                                                amxc_var_t* ret) {
    amxd_status_t status = amxd_status_unknown_error;
    amxc_var_t* forcevar = GET_ARG(args, "force");
    uint64_t count = 0;
    amxd_trans_t transaction;
    amxd_trans_init(&transaction);
    amxd_dm_t* dm = sample_app_get_dm();
    amxd_object_t* dummmymultiinstance_obj = amxd_object_get_child(lcmsampleapp, DUMMYMULTIINSTANCE);
    bool force = amxc_var_dyncast(bool, forcevar);

    if(dummmymultiinstance_obj == NULL) {
        SAH_TRACEZ_ERROR(ME, "Could not get " DUMMYMULTIINSTANCE " obj");
        status = amxd_status_unknown_error;
        goto exit;
    }

    amxd_trans_set_attr(&transaction, amxd_tattr_change_ro, true);
    amxd_trans_select_object(&transaction, dummmymultiinstance_obj);
    amxd_object_for_each(instance, it, dummmymultiinstance_obj) {
        amxd_object_t* inst = amxc_llist_it_get_data(it, amxd_object_t, it);
        bool retain = amxd_object_get_value(bool, inst, "Retain", NULL);
        if(!retain || force) {
            amxd_trans_del_inst(&transaction, amxd_object_get_index(inst), NULL);
            count++;
        }
    }

    if((status = amxd_trans_apply(&transaction, dm)) != amxd_status_ok) {
        SAH_TRACEZ_ERROR(ME, "Could not apply clear transaction");
        count = 0;
    } else {
        SAH_TRACEZ_INFO(ME, "Cleared succesfully %" PRIu64 " entries from " DUMMYMULTIINSTANCE);
    }

exit:
    amxd_trans_clean(&transaction);
    amxc_var_set(uint64_t, ret, count);
    return status;
}

amxd_status_t _LCMSampleApp_addDummyInstanceEntry(amxd_object_t* lcmsampleapp,
                                                  UNUSED amxd_function_t* func,
                                                  amxc_var_t* args,
                                                  amxc_var_t* ret) {
    amxd_status_t status = amxd_status_unknown_error;
    amxc_var_t* var_key = GET_ARG(args, "key");
    amxc_var_t* var_value = GET_ARG(args, "value");
    amxc_var_t* var_retain = GET_ARG(args, "retain");
    amxd_dm_t* dm = sample_app_get_dm();
    amxd_trans_t transaction;
    amxd_object_t* dummmymultiinstance_obj;
    bool retbool = false;

    dummmymultiinstance_obj = amxd_object_get_child(lcmsampleapp, DUMMYMULTIINSTANCE);
    if(dummmymultiinstance_obj == NULL) {
        SAH_TRACEZ_ERROR(ME, "Could not get " DUMMYMULTIINSTANCE " obj");
        status = amxd_status_unknown_error;
        goto exit;
    }

    amxd_trans_init(&transaction);
    amxd_trans_set_attr(&transaction, amxd_tattr_change_ro, true);

    amxd_trans_select_object(&transaction, dummmymultiinstance_obj);
    amxd_trans_add_inst(&transaction, 0, NULL);

    amxd_trans_set_param(&transaction, "Key", var_key);
    amxd_trans_set_param(&transaction, "Value", var_value);
    if(var_retain) {
        amxd_trans_set_param(&transaction, "Retain", var_retain);
    }

    status = amxd_trans_apply(&transaction, dm);
    amxd_trans_clean(&transaction);

    if(status == amxd_status_ok) {
        SAH_TRACEZ_INFO(ME, "Added a new entry to " DUMMYMULTIINSTANCE);
        retbool = true;
    } else {
        SAH_TRACEZ_ERROR(ME, "Could not add new entry (%d)", status);
    }

exit:
    amxc_var_set(bool, ret, retbool);
    return status;
}

amxd_status_t _LCMSampleApp_getDummyInstanceValue(UNUSED amxd_object_t* lcmsampleapp,
                                                  UNUSED amxd_function_t* func,
                                                  UNUSED amxc_var_t* args,
                                                  amxc_var_t* ret) {
    amxc_var_set(cstring_t, ret, "TODO: Implement this");
    return amxd_status_unknown_error;
}

amxd_status_t _LCMSampleApp_triggerglobalevent(amxd_object_t* lcmsampleapp,
                                               UNUSED amxd_function_t* func,
                                               amxc_var_t* args,
                                               UNUSED amxc_var_t* ret) {
    SAH_TRACEZ_INFO(ME, "Emitting event");
    amxd_object_send_signal(lcmsampleapp, "EVENT:LCM:SAMPLE", args, false);
    return amxd_status_ok;
}

