package com.practice;

public enum Types {
    HONDA("Honda"), FORD("Ford"), BMW("Bmw"), MERCEDES("Mercedes");


    private final String type;

    Types(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
