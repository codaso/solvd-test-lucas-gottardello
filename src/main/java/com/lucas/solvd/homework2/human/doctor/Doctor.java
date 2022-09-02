package com.lucas.solvd.homework2.human.doctor;

public class Doctor {
    private int salary;
    private String prescription;
    private String availableDays;

    public Doctor() {
    }


    public int getSalary() {
        return this.salary;
    }

    public String getPrescription() {
        return this.prescription;
    }

    public String getAvailableDays() {
        return this.availableDays;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public void setAvailableDays(String availableDays) {
        this.availableDays = availableDays;
    }

    private boolean iAmTheDoctor() {
        System.out.println("I am the Doctor");
        return true;
    }


    @Override
    public String toString() {
        return "[Doctor specialty: " + getClass().getSimpleName() +
                "]";
    }


}
