package com.spn.communication.connector;

import com.spn.communication.data.AbstractMessage;

/**
 * Created by pedrocosta on 24/05/16.
 */
public interface IMessageSender {



    public int sendMessage(AbstractMessage object);
}
