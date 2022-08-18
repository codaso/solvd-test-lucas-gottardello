package com.lucas.solvd.homework2.human;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Patient extends Human {
    Logger logger = LogManager.getLogger(Patient.class);
    public Injury injury;
    public int patientBalance;
    public String assignedDoctor;

    public Patient() {
        super();
    }

    public Patient(String name, String lastName, String gender, int age) {
        super(name, lastName, gender, age);
        this.patientBalance = 0;
    }

    @Override
    public String toString() {
        return "[Patient Class: " + getClass().getSimpleName() +
                ", Human Class: Name = " + getName() +
                ", Last-name = " + getLastname() + "]";
    }


}