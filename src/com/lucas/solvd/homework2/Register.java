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

        //check problem, should go on Appointment class
        if (problem == "Fracture") {
            this.assignedDoctor = "Traumatologist";
        } else if (problem == "Primary care") {
            this.assignedDoctor = "Clinician";
        } else if (problem == "Baby-checkup") {
            this.assignedDoctor = "Pediatrician";
        }
        //Add cost to patient's payment variable
        //patient.payment = patient.payment + doctor.getSalary();
        //Appointment appointment = new Appointment(assignedDoctor, patient, date);
        //add new node on appointmentList with attributes: doctor(string), patient pointer, date
    }

    //Getters
    public int getAmountOfPatients() {
        return amountOfPatients;
    }
}
