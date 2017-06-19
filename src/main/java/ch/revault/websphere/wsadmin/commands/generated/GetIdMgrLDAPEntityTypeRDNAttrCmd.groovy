/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the RDN attributes configuration of an LDAP entity type configuration.
*/
@Generated("with GenerateAdminCommands")
class GetIdMgrLDAPEntityTypeRDNAttrCmd extends AdminCmd<Void> {
    GetIdMgrLDAPEntityTypeRDNAttrCmd() {
        super("getIdMgrLDAPEntityTypeRDNAttr")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * The name of the LDAP entity type.
     */
    def 'entityTypeName'(String value) {
        parameter("entityTypeName", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
