package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.IDoctor;

public class Psychologist extends Doctor implements IDoctor {
    public Psychologist() {
        super();
        setSalary(salary());
        setPrescription(this.prescription());
        setAvailableDays(this.availableDays());
    }

    public int salary() {
        return 850;
    }

    public int treatmentCost() {
        return getSalary();
    }

    @Override
    public String prescription() {
        return "Psychologist examination: Come visit me 2 days a week and take this pills";
    }

    @Override
    public String availableDays() {
        return "Thursday";
    }

    ;
}

