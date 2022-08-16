package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.IDoctor;

public class Psychologist extends Doctor implements IDoctor {
    public Psychologist(String name, String lastName) {
        super(name, lastName, 850);
    }

    public int treatmentCost() {
        return getSalary();
    }

    public String prescription() {
        return "Psychologist examination: Come visit me 2 days a week and take this pills";
    }
}
