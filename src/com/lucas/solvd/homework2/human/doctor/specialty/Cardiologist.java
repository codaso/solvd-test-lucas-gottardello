package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.IDoctor;

public class Cardiologist extends Doctor implements IDoctor {
    public Cardiologist(String name, String lastname) {
        super(name, lastname, 600);
    }

    public int treatmentCost() {
        return getSalary();
    }

    public String prescription() {
        return "Reduce stress, don't eat fast food and come check yourself with me for 1 month";
    }
}
