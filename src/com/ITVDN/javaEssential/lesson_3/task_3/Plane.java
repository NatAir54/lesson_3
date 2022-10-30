package com.ITVDN.javaEssential.lesson_3.task_3;

public class Plane extends Vehicle{
    private int height; // высота полета
    private int planePassengerCount;


    public Plane(int price, double speed, int year, int height, int planePassengerCount) {
        super(price, speed, year);
        this.height = height;
        this.planePassengerCount = planePassengerCount;
    }

    @Override
    public String toString() {
        return "Plane: " + "\nPrice: " + this.price + " $" + "\nSpeed: " + this.speed + " km/h" + "\nYear: " + this.year
                + "\nHeight: " + this.height + " km" + "\nNumber of passengers: " + this.planePassengerCount;
    }
}
