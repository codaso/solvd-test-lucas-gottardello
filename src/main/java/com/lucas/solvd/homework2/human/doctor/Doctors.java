package com.lucas.solvd.homework2.human.doctor;

public enum Doctors {
    CARDIOLOGIST("heart"),
    CLINICIAN("regular inspection"),
    DERMATOLOGIST("skin"),
    PEDIATRICIAN("toddler"),
    PSYCHOLOGIST("mental"),
    TRAUMATOLOGIST("physical");

    private String mainFocus;

    Doctors(String mainFocus) {
        this.mainFocus = mainFocus;
    }

    public String mainFocus() {
        return this.mainFocus;
    }


}
