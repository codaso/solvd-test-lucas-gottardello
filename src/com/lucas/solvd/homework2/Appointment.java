package com.lucas.solvd.homework2;

public class Appointment extends Prescription {

    public String patientAppointment;

    public void setAppointment(Prescription prescription) {
        this.patientAppointment = prescription.patientPrescription + ", your appointment is on day X on Hospital Y";


    }
}
