package com.company;

// Set attributes
public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Parameterized constructor
    public Automobile() {
        make = "";
        model = "";
        color = "";
        year = 0;
        mileage = 0;
    }

    // Create a new auto
    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    //set methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // get methods
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public int getMileage() {
        return this.mileage;
    }
}
