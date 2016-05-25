package com.spn.communication.connector;

import com.spn.communication.data.AbstractSPNDataObject;

/**
 * Created by pedrocosta on 24/05/16.
 */
public interface ISPNConnector {



    public int sendObject(AbstractSPNDataObject object);
}
