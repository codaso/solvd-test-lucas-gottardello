package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.IDoctor;

public class Dermatologist extends Doctor implements IDoctor {
    public Dermatologist() {
        super();
        setSalary(salary());
        setPrescription(this.prescription());
        setAvailableDays(this.availableDays());
    }

    public int salary() {
        return 500;
    }

    public int treatmentCost() {
        return getSalary();
    }

    @Override
    public String prescription() {

        return "Dermatologist examination: Use this *product* for your skin every 3 days";
    }

    @Override
    public String availableDays() {
        return "Wednesday";
    }
}