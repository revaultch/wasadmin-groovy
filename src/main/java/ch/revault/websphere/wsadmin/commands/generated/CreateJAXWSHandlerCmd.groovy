/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Create a JAX-WS Handler
*/
@Generated("with GenerateAdminCommands")
class CreateJAXWSHandlerCmd extends AdminCmd<Void> {
    CreateJAXWSHandlerCmd() {
        super("createJAXWSHandler")
    }

    /**
     * The name given to the JAX-WS Handler
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * The class name associated with the JAX-WS Handler
     */
    def 'className'(String value) {
        parameter("className", value)
    }

    /**
     * The description associated with the JAX-WS Handler
     */
    def 'description'(String value) {
        parameter("description", value)
    }

}
