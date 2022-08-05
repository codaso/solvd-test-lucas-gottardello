package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.IDoctor;


public final class Traumatologist extends Doctor implements IDoctor {


    //constructors
    public Traumatologist() {
        super();
    }

    public Traumatologist(String name, String lastName) {

        super(name, lastName, 800);
    }


    public int treatmentCost() {
        return getSalary();
    }

    public String prescription() {
        return "You need to exercise X part of your body for 3 months";
    }


}
