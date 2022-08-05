package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.IDoctor;

public class Dermatologist extends Doctor implements IDoctor {
    public Dermatologist(String name, String lastname) {
        super(name, lastname, 650);
    }

    public int treatmentCost() {
        return getSalary();
    }

    public String prescription() {
        return "Use this *product* for your skin every 3 days";
    }
}