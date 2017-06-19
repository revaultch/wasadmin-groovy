/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Updates a base entry for the specified repository. 
*/
@Generated("with GenerateAdminCommands")
class UpdateIdMgrRepositoryBaseEntryCmd extends AdminCmd<Void> {
    UpdateIdMgrRepositoryBaseEntryCmd() {
        super("updateIdMgrRepositoryBaseEntry")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * The name of a base entry.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * Name in the repository for the base entry
     */
    def 'nameInRepository'(String value) {
        parameter("nameInRepository", value)
    }

}
