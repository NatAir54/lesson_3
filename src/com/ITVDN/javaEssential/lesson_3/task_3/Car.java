package com.ITVDN.javaEssential.lesson_3.task_3;

public class Car extends Vehicle{

    public Car(int price, double speed, int year) {
        super(price, speed, year);
    }

    @Override
    public String toString() {
        return "Car: " + "\nPrice: " + this.price + " $" + "\nSpeed: " + this.speed + " km/h" + "\nYear: " + this.year;
    }
}
