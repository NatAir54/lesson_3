package com.ITVDN.javaEssential.lesson_3.task_2;

public class GoodPupil extends Pupil{
    String character;

    public GoodPupil(String name, String lastName, int age, String character) {
        super(name, lastName, age);
        this.character = character;
    }

    @Override
    void study(){
        System.out.println("I am a good pupil");
    }

    @Override
    void read() {
        System.out.println("My reading is good");
    }

    @Override
    void write() {
        System.out.println("My writing is good");
    }

    @Override
    void relax() {
        System.out.println("I relax after my good studying");
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getLastName() + ", " + super.getAge() + " years old, " + this.character + " character";
    }
}
