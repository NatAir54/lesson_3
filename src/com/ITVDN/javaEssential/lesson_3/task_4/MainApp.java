package com.ITVDN.javaEssential.lesson_3.task_4;

import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int proKey = 1;
        int expKey = 2;

        System.out.print("������� ����� �����: ");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();

        if (key == proKey) {
            System.out.println("�� ������ ������������ ������� Pro!");
            // ������� ��������� ProDocumentWorker, ����������� � �������� ������ DocumentWorker
            DocumentWorker proDocument = new ProDocumentWorker();
            proDocument.openDocument();
            proDocument.editDocument();
            proDocument.saveDocument();
        } else if (key == expKey) {
            System.out.println("�� ������ ������������ ������� Exp!");
            // ������� ��������� ExpDocumentWorker, ����������� � �������� ������ DocumentWorker
            DocumentWorker expDocument = new ExpertDocumentWorker();
            expDocument.openDocument();
            expDocument.editDocument();
            expDocument.saveDocument();
        } else {
            System.out.println("�� ������ ������������ ���������� �������!");
            DocumentWorker document = new DocumentWorker();
            document.openDocument();
            document.editDocument();
            document.saveDocument();
        }
    }
}
