package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.IDoctor;


public final class Pediatrician extends Doctor implements IDoctor {

    //constructors
    public Pediatrician() {
        super();
    }

    public Pediatrician(String name, String lastName) {

        super(name, lastName, 800);
    }


    public int treatmentCost() {
        return getSalary();
    }

    public String prescription() {
        return "Come check yourself with me 3 days a week";
    }


}
