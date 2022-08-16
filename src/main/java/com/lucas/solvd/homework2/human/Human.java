package com.lucas.solvd.homework2.human;

import com.lucas.solvd.homework2.exceptions.InvalidNameException;

public abstract class Human {
    private String name = "Unknown";
    private String lastName = "Unknown";


    //constructors
    public Human() {
    }

    public Human(String name, String lastName) {
        try {
            if (name == "" || lastName == "") {
                throw new InvalidNameException("Name should have at least 1 character");
            }
        } catch (Exception e) {

        }
        this.name = name;
        this.lastName = lastName;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    //abstract method
    public abstract void typeOfHuman();

    //overrides
    @Override
    public int hashCode() {
        return name.hashCode() + lastName.hashCode() + +(short) Math.random() * 31000;
    }

    @Override
    public String toString() {
        return "Human Class = [Name : " + name + ", Last-name: " + lastName + "]";
    }

    @Override
    public boolean equals(Object o) {
        Human h = (Human) o;
        if (h.name == this.name && h.lastName == this.lastName && h.hashCode() == this.hashCode()) {
            return true;
        } else {
            return false;
        }
    }
}
