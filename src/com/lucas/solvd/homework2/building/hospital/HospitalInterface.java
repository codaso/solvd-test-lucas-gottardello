package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.patient.Patient;

public interface HospitalInterface {

    void registerPatient(Patient patient);

    void registerDoctor(Doctor doctor);
}
