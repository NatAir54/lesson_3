package com.ITVDN.javaEssential.lesson_3.task_4;

public class ProDocumentWorker extends DocumentWorker {
    @Override
    void editDocument() {
        System.out.println("�������� ��������������");
    }

    @Override
    void saveDocument() {
        System.out.println("�������� �������� � ������ �������, ���������� � ��������� �������� �������� � ������ �������");
    }
}
