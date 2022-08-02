package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.interfaces.DoctorInterfaces;
import com.lucas.solvd.homework2.human.doctor.interfaces.specialty.ClinicianInterface;
import com.lucas.solvd.homework2.human.patient.Patient;


public final class Clinician extends Doctor implements ClinicianInterface, DoctorInterfaces {
    private final String className = "Clinician";
    public int salary = 900;

    //constructors
    public Clinician() {
        super();
    }

    public Clinician(String name, String lastName) {
        super(name, lastName);
    }


    public int treatmentCost() {
        return salary;
    }

    public void normalCheckup(Patient patient) {
        patient.patientBalance = patient.patientBalance + 150;
    }

}
