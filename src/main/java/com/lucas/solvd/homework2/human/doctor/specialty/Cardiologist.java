package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.IDoctor;

public class Cardiologist extends Doctor implements IDoctor {

    public Cardiologist() {
        super();
        setSalary(this.salary());
        setPrescription(this.prescription());
        setAvailableDays(this.availableDays());
    }

    public int treatmentCost() {
        return getSalary();
    }

    public int salary() {
        return 600;
    }


    @Override
    public String prescription() {
        return "Cardiologist examination: Reduce stress, don't eat fast food and come check yourself with me for 1 month";
    }

    @Override
    public String availableDays() {
        return "Tuesday, Wednesday and Thursday";
    }
}
