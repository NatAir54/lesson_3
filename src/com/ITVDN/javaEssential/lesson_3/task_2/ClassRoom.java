package com.ITVDN.javaEssential.lesson_3.task_2;

public class ClassRoom {

    public ClassRoom(Pupil pupil) {
        System.out.println(pupil.toString());
        pupil.study();
        pupil.read();
        pupil.write();
        pupil.relax();

    }
}
