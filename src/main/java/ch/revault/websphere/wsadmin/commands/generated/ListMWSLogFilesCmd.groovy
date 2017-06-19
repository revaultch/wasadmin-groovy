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
class ListMWSLogFilesCmd extends AdminCmd<Void> {
    ListMWSLogFilesCmd() {
        super("listMWSLogFiles")
    }

    /**
     * null
     */
    def 'nodeName'(java.lang.String value) {
        parameter("nodeName", value)
    }

    /**
     * null
     */
    def 'serverName'(java.lang.String value) {
        parameter("serverName", value)
    }

    /**
     * null
     */
    def 'dirName'(java.lang.String value) {
        parameter("dirName", value)
    }

}
