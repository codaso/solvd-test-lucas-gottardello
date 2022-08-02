package com.lucas.solvd.homework2.human.doctor.specialty;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.interfaces.DoctorInterfaces;
import com.lucas.solvd.homework2.human.doctor.interfaces.specialty.TraumatologistInterface;
import com.lucas.solvd.homework2.human.patient.Patient;

public final class Traumatologist extends Doctor implements TraumatologistInterface, DoctorInterfaces {

    private final String className = "Traumatologist";
    public int salary = 800;

    //constructors
    public Traumatologist() {
        super();
    }

    public Traumatologist(String name, String lastName) {

        super(name, lastName);
    }


    public int treatmentCost() {
        return 800;
    }

    public void repairBones(Patient patient) {
        patient.patientBalance = patient.patientBalance + 200;
    }

}
