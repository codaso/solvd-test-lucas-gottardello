package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.IDoctor;


public final class Clinician extends Doctor implements IDoctor {

    //constructors
    public Clinician() {
        super();
    }

    public Clinician(String name, String lastName) {
        super(name, lastName, 200);
    }


    public int treatmentCost() {
        return getSalary();
    }

    public String prescription() {
        return "Clinician examination: I'll make a regular inspection";
    }


}
