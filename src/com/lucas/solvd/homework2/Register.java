package com.lucas.solvd.homework2;


public class Register extends Hospital {
    private int amountOfPatients;
    private String assignedDoctor;

    //Constructor
    public Register(Patient patient, String problem) {
        amountOfPatients++;
        patient.setProblem(problem);
        patientsList.add(patient);
        System.out.println("Patient: " + patient.getName() + "is now registered");
        if (patient.getProblem() == "Fracture") {
            this.assignedDoctor = "Traumatologist";
        } else if (patient.getProblem() == "Primary care") {
            this.assignedDoctor = "Primary care";
        } else if (patient.getProblem() == "Baby-checkup") {
            this.assignedDoctor = "Baby-checkup";
        }
        Appointment appointment = new Appointment(assignedDoctor, patient);
    }

    //Getters
    public int getAmountOfPatients() {
        return amountOfPatients;
    }
}
