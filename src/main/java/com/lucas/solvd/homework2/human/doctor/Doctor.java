package com.lucas.solvd.homework2.human.doctor;

import com.lucas.solvd.homework2.human.Human;

public class Doctor extends Human {

    private int doctorID = 0;
    public static int doctorAmount = 1;
    private int salary;

    //Constructors
    public Doctor() {
    }

    public Doctor(String name, String lastName, int salary) {
        super(name, lastName, "male", 100);
        this.salary = salary;
        this.doctorID = doctorAmount;
        doctorAmount++;
    }


    //getters
    public int getDoctorID() {
        return this.doctorID;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "[Doctor Class: " + getClass().getSimpleName() +
                ", Human Class = Name : " + getName() +
                ", Last-name: " + getLastname() + "]";
    }


}
