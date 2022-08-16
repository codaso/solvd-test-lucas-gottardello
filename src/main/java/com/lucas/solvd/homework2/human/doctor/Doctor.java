package com.lucas.solvd.homework2.human.doctor;

import com.lucas.solvd.homework2.human.Human;

public class Doctor extends Human {

    private int doctorID;
    private int salary;

    //Constructors
    public Doctor() {
    }

    public Doctor(String name, String lastName, int salary) {
        super(name, lastName);
        this.salary = salary;
        this.doctorID = hashCode();
    }


    //getters
    public int getDoctorID() {
        return this.doctorID;
    }

    public int getSalary() {
        return this.salary;
    }

    //override
    @Override
    public void typeOfHuman() {
        System.out.println("My type of human is Doctor");
    }

    @Override
    public String toString() {
        return "[Doctor Class: " + getClass().getSimpleName() +
                ", Human Class = Name : " + getName() +
                ", Last-name: " + getLastName() + "]";
    }


}
