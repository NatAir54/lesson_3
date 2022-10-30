package com.ITVDN.javaEssential.lesson_3.task_2;

public class MainApp {
    public static void main(String[] args) {
        // Создаем массив типа ClassRoom
        ClassRoom[] pupils = new ClassRoom[4];


        // Инициализируем елементы массива
        pupils[0] = new ClassRoom(new ExcellentPupil("Nataliia", "Barsukova", 15, "excellent"));
        System.out.println();
        pupils[1] = new ClassRoom(new GoodPupil("Masha", "Popova", 14, "calm"));
        System.out.println();
        pupils[2] = new ClassRoom(new GoodPupil("Mira", "Lasova", 16, "kind"));
        System.out.println();
        pupils[3] = new ClassRoom(new BadPupil("Boris", "Guchko", 15, "parrot"));
    }

}
