package com.spn.communication.data;

/**
 * Created by pedrocosta on 24/05/16.
 */
public class TemperatureMessage extends AbstractMessage {


    private Integer temperature;

    public TemperatureMessage(){
        super();

    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
