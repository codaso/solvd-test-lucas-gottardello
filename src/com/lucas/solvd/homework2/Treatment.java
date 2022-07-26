package com.lucas.solvd.homework2;

public class Treatment extends Diagnosis {

    public String patientTreatment;

    public void setTreatment(Diagnosis diagnosis) {
        this.patientTreatment = diagnosis.patientDiagnosis + ", and your treatment is: some treatment";
    }

}
