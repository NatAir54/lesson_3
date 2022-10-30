package com.ITVDN.javaEssential.lesson_3.task_6;

public class PrintInColors extends Printer{
    public static void main(String[] args) {

        // Приведение типа
        Printer printer1 = new PrintInColors(); // ПОЛИМОРФНАЯ ССЫЛКА - через родителя создаем объект потомка
        Printer printer2 = new Printer(); // экземпляр родителя
        PrintInColors color = new PrintInColors(); // экземпляр наследника

        String string = "I'm studying colors!";

        printer1.print(string);
        printer2.print(string, "I am smart.");
        color.print(string, "I will manage!", " Google always helps me.");
    }
}
