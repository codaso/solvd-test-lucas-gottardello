package com.lucas.solvd.homework2;

public class Main {
    public static void main(String[] args) {

        Patient zero = new Patient();
        zero.patientName = "Juan";
        zero.gender = "Male";
        zero.age = 65;

        Diagnosis d = new Diagnosis();
        Treatment t = new Treatment();
        Prescription p = new Prescription();
        Appointment a = new Appointment();

        d.setDiagnosis(zero);
        t.setTreatment(d);
        p.setPrescription(t);
        a.setAppointment(p);


        //System.out.println(d.patientDiagnosis);
        //System.out.println(t.patientTreatment);
        //System.out.println(p.patientPrescription);
        System.out.println(a.patientAppointment);


        System.out.println(zero.hashCode());


        System.out.println(zero.toString());


        Patient one = new Patient();
        one.patientName = "Belen";
        one.age = 30;
        one.gender = "Female";

        boolean i = zero.equals(one);
        System.out.println(i);


    }
}
