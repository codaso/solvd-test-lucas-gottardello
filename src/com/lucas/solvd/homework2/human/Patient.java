package com.lucas.solvd.homework2.human;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Patient extends Human {
    Logger logger = LogManager.getLogger(Patient.class);
    private int patientID;
    public String gender = "Unknown";
    public int age;
    public Injury injury;
    public int patientBalance = 0;


    //Constructors
    public Patient() {
        super();
    }

    public Patient(String name, String lastName, String gender, int age) {
        super(name, lastName);
        try {
            if (age < 1) {
                throw new IllegalArgumentException("Age must be greater than 1");
            }
        } catch (IllegalArgumentException e) {
            logger.info(e);
        }
        this.age = age;
        try {
            if (gender != "male" && gender != "female") {
                throw new IllegalArgumentException("Gender must be 'male' or 'female' ");
            }
        } catch (IllegalArgumentException e) {
            logger.info(e);
        }
        this.gender = gender;
        this.patientID = hashCode();
    }

    //setters
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.gender = age;
    }

    //getters
    public int getPatientID() {
        return patientID;
    }

    //override
    @Override
    public void typeOfHuman() {
        logger.info("My type of human is Patient");
    }


}