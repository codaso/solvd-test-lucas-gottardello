package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.exceptions.InvalidAgeException;
import com.lucas.solvd.homework2.exceptions.InvalidGenderException;
import com.lucas.solvd.homework2.exceptions.InvalidNameException;
import com.lucas.solvd.homework2.human.patient.Patient;

import java.util.LinkedList;

public class GeneratePatients {
    Hospital hospital = new Hospital("");
    //generate patients and add them to linkedList
    Patient patient1 = new Patient("patient1", "one", "male", 10);
    Patient patient2 = new Patient("patient2", "two", "female", 15);
    Patient patient3 = new Patient("patient3", "three", "male", 20);
    Patient patient4 = new Patient("patient4", "four", "female", 25);
    Patient patient5 = new Patient("patient5", "five", "female", 30);
    Patient patient6 = new Patient("patient6", "six", "male", 35);

    public GeneratePatients() throws InvalidAgeException, InvalidNameException, InvalidGenderException {
    }

    public void generatePatients(LinkedList<Patient> patientList) {
        hospital.addPatient(patientList, patient1);
        hospital.addPatient(patientList, patient2);
        hospital.addPatient(patientList, patient3);
        hospital.addPatient(patientList, patient4);
        hospital.addPatient(patientList, patient5);
        hospital.addPatient(patientList, patient6);
    }

}
