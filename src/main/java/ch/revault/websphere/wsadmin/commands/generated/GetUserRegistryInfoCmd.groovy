/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns information about a user registry from the administrative security configuration or an application security domain.
*/
@Generated("with GenerateAdminCommands")
class GetUserRegistryInfoCmd extends AdminCmd<Void> {
    GetUserRegistryInfoCmd() {
        super("getUserRegistryInfo")
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The type of the user registry values include LDAPUserRegistry, WIMUserRegistry, CustomUserRegistry, and LocalOSUserRegistry
     */
    def 'userRegistryType'(String value) {
        parameter("userRegistryType", value)
    }

}
