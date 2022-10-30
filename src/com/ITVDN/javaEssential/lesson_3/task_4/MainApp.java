package com.ITVDN.javaEssential.lesson_3.task_4;

import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int proKey = 1;
        int expKey = 2;

        System.out.print("Введите номер ключа: ");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();

        if (key == proKey) {
            System.out.println("Вы можете пользоваться версией Pro!");
            // создаем экземпляр ProDocumentWorker, приведенный к базовому классу DocumentWorker
            DocumentWorker proDocument = new ProDocumentWorker();
            proDocument.openDocument();
            proDocument.editDocument();
            proDocument.saveDocument();
        } else if (key == expKey) {
            System.out.println("Вы можете пользоваться версией Exp!");
            // создаем экземпляр ExpDocumentWorker, приведенный к базовому классу DocumentWorker
            DocumentWorker expDocument = new ExpertDocumentWorker();
            expDocument.openDocument();
            expDocument.editDocument();
            expDocument.saveDocument();
        } else {
            System.out.println("Вы можете пользоваться бесплатной версией!");
            DocumentWorker document = new DocumentWorker();
            document.openDocument();
            document.editDocument();
            document.saveDocument();
        }
    }
}
