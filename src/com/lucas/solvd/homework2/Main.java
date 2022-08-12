package com.lucas.solvd.homework2;

import com.lucas.solvd.homework2.building.hospital.Appointment;
import com.lucas.solvd.homework2.building.hospital.Hospital;
import com.lucas.solvd.homework2.building.hospital.Treatment;
import com.lucas.solvd.homework2.human.Injury;
import com.lucas.solvd.homework2.human.Patient;
import com.lucas.solvd.homework2.human.doctor.specialty.Clinician;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Hospital hospital = new Hospital("BestHospital");

        //flow:create patient, patient decides if check now or schedule a day
        //if check now--> check with regular doctor,patient describes problem
        //doctor decides if instant treatment, if yes-->treat, no-->make an appointment


        //create patient
        Patient patient = new Patient("Alberto", "Fernandez", "male", 85);
        //add patient to patientList
        hospital.registerPatient(patient);

        //does the patient want to make a scheduled appointment(input)?
        //if no, then -->
        boolean scheduledDate = false;
        if (!scheduledDate) {
            //guard attention, with regular doctor (clinic)
            Clinician clinic = new Clinician("Camila", "Perez");
            logger.info(clinic.prescription());
            //patient describes the problem, problem can be: mental,physical,heart or skin, pain level: 1-10
            Injury patientInjury = new Injury("physical", 5);
            patient.injury = patientInjury;

            //treatRightNow---> decides gravity of situation
            boolean treatRightNow = hospital.instantTreatment(patient.injury);

            if (treatRightNow) {
                Treatment t = new Treatment(patient.injury.annoyance, patient);
                logger.info("you have been healed, you need to pay the hospital a total of: " + patient.patientBalance);

            } else {
                logger.info("your treatment can wait, make an appointment");
                scheduledDate = true;
            }

        }
        //scheduledDate = false;
        if (scheduledDate) {
            Date d = new Date(13, 8, 2022);
            Appointment appointment = new Appointment(patient, d);
            logger.info(patient.getName() + " appointment is on day: " + d.day + "/" + d.month);
            hospital.registerAppointment(appointment);

            if (patient.age < 12) {
                logger.info("Your assigned doctor will be a Pediatrician");
            } else logger.info("Your assigned doctor will be assigned on the date's day");
        }


        //generate appointments
        Patient patient1 = new Patient("Nicki", "Nicole", "female", 20);
        Patient patient2 = new Patient("Biza", "Rap", "male", 25);
        Patient patient3 = new Patient("Donald", "Trump", "male", 70);
        Date d1 = new Date(15, 8, 2022);
        Date d2 = new Date(16, 8, 2022);
        Date d3 = new Date(17, 8, 2022);
        Appointment a1 = new Appointment(patient1, d1);
        Appointment a2 = new Appointment(patient2, d2);
        Appointment a3 = new Appointment(patient3, d3);
        hospital.registerAppointment(a1);
        hospital.registerAppointment(a2);
        hospital.registerAppointment(a3);
        hospital.printAppointments();
        logger.info("Amount of patients: " + hospital.getAmountOfPatients());
        logger.info("Amount of appointments: " + hospital.getAmountOfAppointments());


        //generate patients and add them to linkedList
        LinkedList<Patient> patientLinkedList = new LinkedList<>();
        Patient patient4 = new Patient("Jorge", "Lanata", "male", 65);
        Patient patient5 = new Patient("Patricia", "Bulrich", "female", 60);
        Patient patient6 = new Patient("Victor", "Warcry", "male", 52);
        patientLinkedList.add(patient4);
        patientLinkedList.add(patient5);
        patientLinkedList.add(patient6);
        logger.info("patients on: patientLinkedList= ");
        patientLinkedList.printAll(patientLinkedList.root);
        logger.info("patientLinkedList size: " + patientLinkedList.size(patientLinkedList.root));

    }


}

