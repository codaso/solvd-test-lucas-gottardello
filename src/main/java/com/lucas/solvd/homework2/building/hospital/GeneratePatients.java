package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.human.patient.Patient;

public class GeneratePatients {
    Hospital hospital = new Hospital("");
    //generate patients and add them to linkedList
    Patient patient1 = new Patient("patient1", "one", "male", 10);
    Patient patient2 = new Patient("patient2", "two", "female", 15);
    Patient patient3 = new Patient("patient3", "three", "male", 20);
    Patient patient4 = new Patient("patient4", "four", "female", 25);
    Patient patient5 = new Patient("patient5", "five", "female", 30);
    Patient patient6 = new Patient("patient6", "six", "male", 35);

    public void generatePatients() {
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(patient4);
        hospital.addPatient(patient5);
        hospital.addPatient(patient6);
    }

}
