package com.lucas.solvd.homework2;

public class Prescription extends Treatment {

    public String patientPrescription;

    public void setPrescription(Treatment treatment) {
        this.patientPrescription = treatment.patientTreatment + ", and your prescription is: some prescription";
    }
}
