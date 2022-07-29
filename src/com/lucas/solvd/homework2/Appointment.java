package com.lucas.solvd.homework2;

public class Appointment extends Hospital {
    private int amountOfAppointments;


    //Constructor
    public Appointment(Doctor doctor, Patient patient, Date date) {
        this.amountOfAppointments++;
        patient.payment = patient.payment + doctor.getSalary();

    }

}
