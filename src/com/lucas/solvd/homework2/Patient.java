package com.lucas.solvd.homework2;

public class Patient extends Human {
    private String gender = "Unknown";
    private int age;
    private String problem = "Unspecified";
    public int payment;

    //Constructors
    public Patient() {
        super();
    }

    public Patient(String name, String lastName, String gender, int age) {
        super(name, lastName);
        this.age = age;
        this.gender = gender;
    }

    //setters
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.gender = age;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    //getters
    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public String getProblem() {
        return this.problem;
    }


}