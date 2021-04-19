package com.factory.main.transport.Airtransport;

import com.factory.main.transport.Transport;

public class AirTransport extends Transport {
    private int wings;
    private int minLength;
    private Transport transport;
    private int typeOfAir;

    public int getTypeOfAir() {
        return typeOfAir;
    }

    public void setTypeOfAir(int typeOfAir) {
        this.typeOfAir = typeOfAir;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public AirTransport(Transport transport, int wings, int minLength, int typeOfAir) {
        super(transport.getPower(), transport.getMaxSpeed(), transport.getWeight(), transport.getType());
        this.wings = wings;
        this.minLength = minLength;
        this.typeOfAir = typeOfAir;
    }

    @Override
    public String toString() {
        return "Air Transport \n the size of wings: " + wings + "\n minimal distance of road: " + minLength +
                "\n type of air transport: " + typeOfAir;
    }
}
