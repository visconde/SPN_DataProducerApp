package com.spn.communication.data;

/**
 * Created by pedrocosta on 24/05/16.
 */
public class TemperatureSPNDataObject extends AbstractSPNDataObject {


    private Integer temperature;

    public TemperatureSPNDataObject(){
        super();

    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
