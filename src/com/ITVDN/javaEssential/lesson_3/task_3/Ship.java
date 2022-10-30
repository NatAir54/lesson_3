package com.ITVDN.javaEssential.lesson_3.task_3;

public class Ship extends Vehicle{
    private String homePort;
    private int shipPassengerCount;

    public Ship(int price, double speed, int year, String homePort, int shipPassengerCount) {
        super(price, speed, year);
        this.homePort = homePort;
        this.shipPassengerCount = shipPassengerCount;
    }

    @Override
    public String toString() {
        return "Ship: " + "\nPrice: " + this.price + " $" + "\nSpeed: " + this.speed + " km/h" + "\nYear: " + this.year
                + "\nNumber of passengers: " + this.shipPassengerCount + "\nHome port: " + this.homePort;
    }
}
