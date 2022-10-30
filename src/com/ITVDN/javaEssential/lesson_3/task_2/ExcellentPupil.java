package com.ITVDN.javaEssential.lesson_3.task_2;

public class ExcellentPupil extends Pupil {
    String mood;

    public ExcellentPupil(String name, String lastName, int age, String mood) {
        super(name, lastName, age);
        this.mood = mood;
    }

    @Override
    void study(){
        System.out.println("I am the best pupil");
    }

    @Override
    void read() {
        System.out.println("My reading is excellent");
    }

    @Override
    void write() {
        System.out.println("My writing is excellent");
    }

    @Override
    void relax() {
        System.out.println("I relax after my excellent studying");
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getLastName() + ", " + super.getAge() + " years old, " + this.mood + " mood";
    }
}
