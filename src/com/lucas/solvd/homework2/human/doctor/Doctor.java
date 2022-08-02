package com.lucas.solvd.homework2.human.doctor;

import com.lucas.solvd.homework2.human.Human;

public class Doctor extends Human {

    private int doctorID;

    //Constructors
    public Doctor() {
    }

    public Doctor(String name, String lastName) {
        super(name, lastName);
        this.doctorID = hashCode();


    }


    public int getDoctorID() {
        return this.doctorID;
    }


}
