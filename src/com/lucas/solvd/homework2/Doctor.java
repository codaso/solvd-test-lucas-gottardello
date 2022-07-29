package com.lucas.solvd.homework2;

public abstract class Doctor extends Human {
    private int salary;

    //Constructors
    public Doctor() {
    }

    public Doctor(String name, String lastName, String doctorType) {
        super(name, lastName);
        setSalary(doctorType);
    }

    public void setSalary(String doctorType) {
        if (doctorType == "Traumatologist") {
            this.salary = 1000;
        } else if (doctorType == "Clinician") {
            this.salary = 800;
        } else if (doctorType == "Pediatrician") {
            this.salary = 900;
        } else {
            this.salary = 0;
        }
    }

    //Getters
    public int getSalary() {
        return this.salary;
    }
}
