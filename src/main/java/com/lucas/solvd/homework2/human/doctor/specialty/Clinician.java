package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.IDoctor;


public final class Clinician extends Doctor implements IDoctor {


    public Clinician() {
        super();
        setPrescription(this.prescription());
        setAvailableDays(this.availableDays());
        setSalary(salary());
    }

    public int salary() {
        return 200;
    }


    public int treatmentCost() {
        return getSalary();
    }

    @Override
    public String prescription() {

        return "Clinician examination: I'll make a regular inspection";
    }

    @Override
    public String availableDays() {
        return "Monday, Tuesday, Wednesday, Thursday, Friday";
    }


}
