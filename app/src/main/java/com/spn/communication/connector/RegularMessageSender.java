package com.spn.communication.connector;

import com.spn.communication.data.AbstractMessage;

/**
 * Created by pedrocosta on 24/05/16.
 */
public class RegularMessageSender implements IMessageSender {



    @Override
    public int sendMessage(AbstractMessage object) {
        int status = 0;

        System.out.println("SPN: Sending......." + object.getId());

        return status;

    }
}
