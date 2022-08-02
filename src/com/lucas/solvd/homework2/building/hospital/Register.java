package com.lucas.solvd.homework2.building.hospital;


public abstract class Register extends Hospital {
    public int amountOfPatients;
    //Constructor

    /*public void register(Patient patient) {
        amountOfPatients++;
        patientsList.add(patient);
        System.out.println("Patient: " + patient.getName() + "added to patientsList");
    }*/

    //Getters
    public int getAmountOfPatients() {
        return amountOfPatients;
    }
}
