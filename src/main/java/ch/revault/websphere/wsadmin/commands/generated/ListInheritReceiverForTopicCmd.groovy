/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* List Inherit Receiver For topic (deprecated - use isInheritReceiverForTopic instead)
*/
@Generated("with GenerateAdminCommands")
class ListInheritReceiverForTopicCmd extends AdminCmd<Void> {
    ListInheritReceiverForTopicCmd() {
        super("listInheritReceiverForTopic")
    }

    /**
     * Bus name
     */
    def 'bus'(String value) {
        parameter("bus", value)
    }

    /**
     * Topicspace name
     */
    def 'topicSpace'(String value) {
        parameter("topicSpace", value)
    }

    /**
     * Topic name
     */
    def 'topic'(String value) {
        parameter("topic", value)
    }

}
