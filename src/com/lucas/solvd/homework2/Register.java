package com.lucas.solvd.homework2;


public class Register extends Hospital {
    private int amountOfPatients;
    private String assignedDoctor;
    private Doctor doctor;

    //Constructor
    public Register(Patient patient, String problem) {
        amountOfPatients++;
        patient.setProblem(problem);
        patientsList.add(patient);
        System.out.println("Patient: " + patient.getName() + "is now registered");

        //check problem,
        if (problem == "Fracture") {
            this.assignedDoctor = "Traumatologist";
            this.doctor = new Traumatologist();
        } else if (problem == "Primary care") {
            this.assignedDoctor = "Clinician";
            this.doctor = new Clinician();
        } else if (problem == "Baby-checkup") {
            this.assignedDoctor = "Pediatrician";
            this.doctor = new Pediatrician();
        }
        //Add cost to patient's payment variable
        patient.payment = patient.payment + doctor.getSalary();
        //Appointment appointment = new Appointment(assignedDoctor, patient);
    }

    //Getters
    public int getAmountOfPatients() {
        return amountOfPatients;
    }
}
