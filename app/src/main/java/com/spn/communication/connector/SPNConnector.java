package com.spn.communication.connector;

import com.spn.communication.data.AbstractSPNDataObject;

/**
 * Created by pedrocosta on 24/05/16.
 */
public class SPNConnector implements ISPNConnector {



    @Override
    public int sendObject(AbstractSPNDataObject object) {
        int status = 0;

        System.out.println("SPN: Sending......." + object.getId());

        return status;

    }
}
