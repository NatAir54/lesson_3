package com.ITVDN.javaEssential.lesson_3.task_6;

public class Printer {
    void print(String value) {
        System.out.println((char) 27 + "[32m" + value); // in green color
    }
    void print(String value1, String value2) {
        // in green and purple
        System.out.println((char) 27 + "[32m" + value1 + " " + (char) 27 + "[35m" + value2);
    }

    void print(String value1, String value2, String value3) {
        // in green, purple and red
        System.out.println((char) 27 + "[32m" + value1 + " " + (char) 27 + "[35m" + value2 + (char) 27 + "[31m" + value3);
    }
}
