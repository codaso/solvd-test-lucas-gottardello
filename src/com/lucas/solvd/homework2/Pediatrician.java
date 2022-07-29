package com.lucas.solvd.homework2;

public class Pediatrician extends Doctor implements Physician {
    private final String className = "Pediatrician";

    //constructors
    public Pediatrician() {
        super();
    }

    public Pediatrician(String name, String lastName) {

        super(name, lastName, "Pediatrician");
    }


    //methods from interface Physician
    public void specialtyPrint() {
        System.out.println("I am a: " + className + " and my specialty is to perform well-baby checkups to manage chronic medical conditions");
    }

    public int cost() {
        return getSalary();
    }
}
