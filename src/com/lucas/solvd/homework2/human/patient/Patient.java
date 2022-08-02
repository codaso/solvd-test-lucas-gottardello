package com.lucas.solvd.homework2.human.patient;

import com.lucas.solvd.homework2.human.Human;

public class Patient extends Human {
    private int patientID;
    private String gender = "Unknown";
    private int age;
    public int patientBalance;


    //Constructors
    public Patient() {
        super();
    }

    public Patient(String name, String lastName, String gender, int age) {
        super(name, lastName);
        this.age = age;
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
    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public int getPatientID() {
        return patientID;
    }


}