/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Information regarding a group of managed nodes. (deprecated)
*/
@Generated("with GenerateAdminCommands")
class GetManagedNodeGroupInfoCmd extends AdminCmd<Void> {
    GetManagedNodeGroupInfoCmd() {
        super("getManagedNodeGroupInfo")
    }

    /**
     * A list of group names.
     */
    def 'groupName'(java.lang.String[] value) {
        parameter("groupName", value)
    }

}
