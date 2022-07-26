package com.lucas.solvd.homework2;

public class Diagnosis extends Patient{

    public String patientDiagnosis;

    public void SetDiagnosis(Patient patient){
        this.patientDiagnosis = "Patient name: " + patient.patientName + " diagnosis is: some diagnosis";
    }
}
