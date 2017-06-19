/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Refresh the WSDL definition for an outbound service.
*/
@Generated("with GenerateAdminCommands")
class RefreshSIBWSOutboundServiceWSDLCmd extends AdminCmd<Void> {
    RefreshSIBWSOutboundServiceWSDLCmd() {
        super("refreshSIBWSOutboundServiceWSDL")
    }

    /**
     * User ID to be used if WSDL is obtained through an authorizing proxy.
     */
    def 'userId'(String value) {
        parameter("userId", value)
    }

    /**
     * Password to be used if WSDL is obtained through an authorizing proxy.
     */
    def 'password'(String value) {
        parameter("password", value)
    }

}
