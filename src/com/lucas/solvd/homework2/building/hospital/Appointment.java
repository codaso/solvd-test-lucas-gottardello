package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.Date;
import com.lucas.solvd.homework2.human.Patient;

public class Appointment {

    Patient patient;
    Date date;
    boolean appointmentDone;

    public Appointment(Patient patient, Date date) {
        this.patient = patient;
        this.date = date;
        appointmentDone = false;
    }

}
