package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.IDoctor;


public final class Traumatologist extends Doctor implements IDoctor {


    public Traumatologist() {
        super();
        setSalary(salary());
        setPrescription(this.prescription());
        setAvailableDays(this.availableDays());
    }


    public int salary() {
        return 950;
    }

    public int treatmentCost() {
        return getSalary();
    }

    @Override
    public String prescription() {
        return "Traumatologist examination: You need to exercise X part of your body for 3 months";
    }

    @Override
    public String availableDays() {
        return "Mondays,Wednesday and Fridays";
    }

    ;


}
