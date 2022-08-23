package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.Date;
import com.lucas.solvd.homework2.human.patient.Patient;

public class Appointment {

    public Patient patient;
    public Date date;


    public Appointment(Patient patient, Date date) {
        this.patient = patient;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        Appointment d = (Appointment) o;
        if (d.date.day == this.date.day && d.date.month == this.date.month && d.date.year == this.date.year) {
            return true;
        } else return false;
    }

}
