package com.practise.spaceport;

public class Main {
    public static void main(String[] args) {

        IStart shuttle = new Shuttle();
        IStart spaceX = new SpaceX();
        IStart rosCosmos = new RosCosmos();

        SpacePort spacePort = new SpacePort();
        spacePort.startSpacePort(shuttle);
        System.out.println();
        spacePort.startSpacePort(rosCosmos);


    }
}
