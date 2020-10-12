package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {

    boolean headLightsOn = false;

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return this.headLightsOn;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }

    public void lightsOn(){
        this.headLightsOn = true;
    }

    public void lightsOff(){
        this.headLightsOn = false;
    }
}
