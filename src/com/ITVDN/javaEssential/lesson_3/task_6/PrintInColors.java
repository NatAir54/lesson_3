package com.ITVDN.javaEssential.lesson_3.task_6;

public class PrintInColors extends Printer{
    public static void main(String[] args) {

        // ���������� ����
        Printer printer1 = new PrintInColors(); // ����������� ������ - ����� �������� ������� ������ �������
        Printer printer2 = new Printer(); // ��������� ��������
        PrintInColors color = new PrintInColors(); // ��������� ����������

        String string = "I'm studying colors!";

        printer1.print(string);
        printer2.print(string, "I am smart.");
        color.print(string, "I will manage!", " Google always helps me.");
    }
}
