package com.ITVDN.javaEssential.lesson_3.task_3;

public class MainApp {
    public static void main(String[] args) {
        Car mazda = new Car(18000, 150.00, 2020);
        System.out.println(mazda);

        System.out.println();

        Plane myPlane = new Plane(1000999, 900, 2019, 12, 1000);
        System.out.println(myPlane);

        System.out.println();

        Ship ship = new Ship(1200000, 50, 2008, "Singapore", 800);
        System.out.println(ship);
    }
}
