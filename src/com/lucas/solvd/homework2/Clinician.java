package com.lucas.solvd.homework2;

public class Clinic extends Doctor implements Physician {
    private final String className = "Clinic";

    //constructors
    public Clinic() {
        super();
    }

    public Clinic(String name, String lastName) {
        super(name, lastName, "Clinic");
    }


    //methods from interface Physician
    public void specialtyPrint() {
        System.out.println("I am a: " + className);
    }

    public int cost() {
        return getSalary();
    }

}
