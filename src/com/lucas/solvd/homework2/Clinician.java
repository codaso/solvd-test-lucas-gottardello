package com.lucas.solvd.homework2;

public class Clinician extends Doctor implements Physician {
    private final String className = "Clinician";

    //constructors
    public Clinician() {
        super();
    }

    public Clinician(String name, String lastName) {
        super(name, lastName, "Clinician");
    }


    //methods from interface Physician
    public void specialtyPrint() {
        System.out.println("I am a: " + className + " and my specialty is to focus on primary care");
    }

    public int cost() {
        return getSalary();
    }

}
