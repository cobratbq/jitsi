package net.java.sip.communicator.service.protocol;

/**
 * Provides additional information on the transport on which Basic Instant
 * Messaging communication is built. Note that this refers to the
 * characteristics of the instant messaging protocol, not to the underlying TCP
 * or UDP transport layer.
 *
 * This interface defines methods that provide information on the transport
 * facilities that are used by the Basic Instant Messaging protocol
 * implementation. Methods can be used to query the transport channel for
 * information such as maximum message size.
 *
 * @author Danny van Heumen
 */
public interface OperationSetBasicInstantMessagingTransport extends OperationSet
{
    /**
     * Compute the maximum message size for a message being sent to the provided
     * contact.
     *
     * <p>
     * If there is no limit to the message size, please use <tt>null</tt>.
     * </p>
     *
     * @param contact the contact to which the message will be sent
     * @return returns the maximum size of the message or <tt>null</tt> if there
     *         is no limit
     */
    Integer getMaxMessageSize(Contact contact);
}
