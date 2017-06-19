/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* null
*/
@Generated("with GenerateAdminCommands")
class ListClusterMemberTemplatesCmd extends AdminCmd<Void> {
    ListClusterMemberTemplatesCmd() {
        super("listClusterMemberTemplates")
    }

    /**
     * null
     */
    def 'clusterName'(String value) {
        parameter("clusterName", value)
    }

}
