package com.ITVDN.javaEssential.lesson_3.task_2;

public class BadPupil extends Pupil{
    String pet;

    public BadPupil(String name, String lastName, int age, String pet) {
        super(name, lastName, age);
        this.pet = pet;
    }

    @Override
    void study(){
        System.out.println("I am a bad pupil");
    }

    @Override
    void read() {
        System.out.println("My reading is bad");
    }

    @Override
    void write() {
        System.out.println("My writing is bad");
    }

    @Override
    void relax() {
        System.out.println("I relax after my bad studying");
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getLastName() + ", " + super.getAge() + " years old, I have a " + this.pet;
    }
}
