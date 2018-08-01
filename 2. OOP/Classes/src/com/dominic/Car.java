package com.dominic;

public class Car {

    private static String Unknown = "Unknown";

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.endsWith("Carrera") || validModel.equals("r8")) {
            this.model = model;
        } else {
            this.model = Unknown;
        }

    }

    public String getModel() {
        return this.model;
    }
}
