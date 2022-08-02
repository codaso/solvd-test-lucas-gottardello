package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.interfaces.DoctorInterfaces;
import com.lucas.solvd.homework2.human.doctor.interfaces.specialty.PediatricianInterface;
import com.lucas.solvd.homework2.human.patient.Patient;


public final class Pediatrician extends Doctor implements PediatricianInterface, DoctorInterfaces {
    private final String className = "Pediatrician";
    public int salary = 700;

    //constructors
    public Pediatrician() {
        super();
    }

    public Pediatrician(String name, String lastName) {

        super(name, lastName);
    }


    public int treatmentCost() {
        return salary;
    }

    public void babyCheckUp(Patient patient) {
        patient.patientBalance = patient.patientBalance + 300;
    }


}
