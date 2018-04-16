package org.zstack.header.network.l3

import org.zstack.header.core.StaticInit

import static org.zstack.header.identity.rbac.RBAC.rbac

@StaticInit
static void init() {
    rbac {
        permissions {
            name = "l3"
            normalAPIs("org.zstack.header.network.l3.**")
        }

        role {
            name = "l3"
            uuid = "884b0fcc99b04120807e64466fd63336"
            normalActionsFromRBAC("l3")
        }
    }
}