package com.lucas.solvd.homework2;

public class Traumatologist extends Doctor implements Physician {

    private final String className = "Traumatologist";

    //constructors
    public Traumatologist() {
        super();
    }

    public Traumatologist(String name, String lastName) {

        super(name, lastName, "Traumatologist");
    }


    //methods from interface Physician
    public void specialtyPrint() {
        System.out.println("I am a: " + className + " and my specialty the treatment of both simple and complex fractures, as well as wounds and injuries caused by accidents or sudden violence");
    }

    public int cost() {
        return getSalary();
    }

}
