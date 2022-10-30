package com.ITVDN.javaEssential.lesson_3.task_4;

public class ExpertDocumentWorker extends ProDocumentWorker{

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
