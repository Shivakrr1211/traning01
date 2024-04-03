package org.example;

public class Vehicle {
    private String engine;
    private int seats;
    private int wheels;
    private int fueltank;
    private String lights;


    public Vehicle(){
        engine = "strong";
        seats = 2;
        wheels = 4;
        fueltank = 14;
        lights = "LED";
    }
    public Vehicle(String engine, int seats, int wheels, int fueltank, String lights) {
        this.engine = engine;
        this.seats = seats;
        this.wheels = wheels;
        this.fueltank = fueltank;
        this.lights = lights;
    }

    public String getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }

    public int getFueltank() {
        return fueltank;
    }

    public String getLights() {
        return lights;
    }
    public String run(){
        return "Running vehicel ";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", seats=" + seats +
                ", wheels=" + wheels +
                ", fueltank=" + fueltank +
                ", lights='" + lights + '\'' +
                '}';
    }
}
