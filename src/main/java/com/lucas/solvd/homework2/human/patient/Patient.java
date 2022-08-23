package com.lucas.solvd.homework2.human.patient;

import com.lucas.solvd.homework2.human.Human;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Function;

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

    public int printBalance(iPrintBalance processor) {
        return processor.printBalance();
    }

    public Function<Integer, Boolean> urgency = (pain) -> (pain > 6);

    @Override
    public String toString() {
        return "[Patient Class: " + getClass().getSimpleName() +
                ", Human Class: Name = " + getName() +
                ", Last-name = " + getLastname() + "]";
    }

    public int getPatientBalance() {
        return this.patientBalance;
    }

    public void setPatientBalance(int i) {
        patientBalance = patientBalance + i;
    }

    public Injury getInjury() {
        return this.injury;
    }


}