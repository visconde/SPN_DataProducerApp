package com.spn.communication.data;

import java.security.Timestamp;
import java.util.UUID;

/**
 * Created by pedrocosta on 24/05/16.
 */
public abstract  class AbstractSPNDataObject {

    private UUID id;
    private Long timestamp;

public AbstractSPNDataObject(){

    id = UUID.randomUUID();
   timestamp = System.currentTimeMillis();

}

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
