package com.lucas.solvd.homework2;


public class Register extends Hospital {
    private int amountOfPatients;

    //Constructor
    public Register(Patient patient, String problem) {
        amountOfPatients++;
        patientsList.add(patient);
        patient.setProblem(problem);
        System.out.println("Patient: " + patient.getName() + "is now registered");
    }

    //Getters
    public int getAmountOfPatients() {
        return amountOfPatients;
    }
}
