package com.factory.main.transport.GroundTransport;

import com.factory.main.transport.Transport;

public class GroundTransport extends Transport {
    private int countWheels;
    private int consumption;
    private Transport transport;
    private int typeOfGround;

    public GroundTransport(Transport transport, int consumption, int countWheels, int typeOfGround) {
        super(transport.getPower(), transport.getMaxSpeed(), transport.getWeight(), transport.getType());
        this.consumption = consumption;
        this.countWheels = countWheels;
        this.typeOfGround = typeOfGround;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public int getTypeOfGround() {
        return typeOfGround;
    }

    public void setTypeOfGround(int typeOfGround) {
        this.typeOfGround = typeOfGround;
    }

    @Override
    public String toString() {
        return "GroundTransport \n count of wheels:" + countWheels +
                "\n average fuel consumption=" + consumption +
                "\n type of ground transport: " + typeOfGround;
    }
}
