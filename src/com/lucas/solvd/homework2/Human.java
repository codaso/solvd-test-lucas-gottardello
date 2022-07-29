package com.lucas.solvd.homework2;

public abstract class Human {
    private String name = "Unknown";
    private String lastName = "Unknown";

    //constructors
    public Human() {
    }

    public Human(String name, String lastName) {
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


    //overrides
    @Override
    public int hashCode() {
        return name.hashCode() + lastName.hashCode();
    }

    @Override
    public String toString() {
        return "[Human name : " + name + ", Human last name: " + lastName + "]";
    }

    @Override
    public boolean equals(Object o) {
        Human h = (Human) o;
        if (h.name == this.name && h.lastName == this.lastName) {
            return true;
        } else {
            return false;
        }
    }
}