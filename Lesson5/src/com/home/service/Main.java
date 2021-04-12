package com.home.service;

import com.home.model.Computer;



public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel I7","RAM23","HDD211", 5);
        computer.printResult();
        computer.on();
    }

}
