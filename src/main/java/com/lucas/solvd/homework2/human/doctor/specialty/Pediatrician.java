package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.IDoctor;


public final class Pediatrician extends Doctor implements IDoctor {

    public Pediatrician() {
        super();
    }

    public Pediatrician(String name, String lastName) {
        super();
        setSalary(salary());
        setPrescription(this.prescription());
        setAvailableDays(this.availableDays());
    }

    public int salary() {
        return 800;
    }

    public int treatmentCost() {
        return getSalary();
    }

    @Override
    public String prescription() {
        return "Pediatrician examination: Come check yourself with me 3 days a week";
    }

    @Override
    public String availableDays() {
        return "Tuesday and Fridays";
    }


}
