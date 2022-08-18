package com.lucas.solvd.homework2;

import com.lucas.solvd.homework2.building.hospital.Appointment;
import com.lucas.solvd.homework2.building.hospital.Hospital;
import com.lucas.solvd.homework2.human.Human;
import com.lucas.solvd.homework2.human.Injury;
import com.lucas.solvd.homework2.human.Patient;
import com.lucas.solvd.homework2.human.doctor.specialty.Clinician;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Hospital hospital = new Hospital("BestHospital");
        hospital.loadDoctors();
        hospital.printDoctorList();
        //flow:create patient, patient decides if check now or schedule a day
        //if check now--> check with regular doctor,patient describes problem
        //doctor decides if instant treatment, if yes-->treat, no-->make an appointment
        //create patient
        Patient patient = new Patient("Alberto", "Fernandez", "male", 85);
        //add patient to patientList
        hospital.registerPatient(patient);
        //does the patient want to make a scheduled appointment?
        //if no, then -->
        boolean scheduledDate = false;
        if (!scheduledDate) {
            //guard attention, with regular doctor (clinic)
            Clinician clinic = new Clinician("Camila", "Perez");
            logger.info(clinic.prescription());
            //patient describes the problem, problem can be: mental,physical,heart or skin, pain level: 1-10
            Injury patientInjury = new Injury("physical", 7);
            patient.injury = patientInjury;

            if (patient.injury.painLevel > 6) {
                hospital.treatment(patientInjury.annoyance, patient);
                System.out.println("--------------");
                System.out.println(patient.assignedDoctor);
                System.out.println("--------------");
                logger.info("you have been healed, you need to pay the hospital a total of: " + patient.patientBalance);
            } else {
                logger.info("your treatment can wait, make an appointment");
                scheduledDate = true;
            }

        }
        if (scheduledDate) {
            Date d = new Date(13, 8, 2022);
            hospital.registerDate(d);
            Appointment appointment = new Appointment(patient, d);
            hospital.registerAppointment(appointment);
            logger.info(patient.getName() + " appointment is on day: " + d.day + "/" + d.month);

            if (patient.age < 12) {
                logger.info("Your assigned doctor will be a Pediatrician");
            } else logger.info("Your assigned doctor will be assigned on the date's day");
        }
        /*
        //generate patients and add them to linkedList
        Patient patient4 = new Patient("Jorge", "Lanata", "male", 65);
        Patient patient5 = new Patient("Patricia", "Bulrich", "female", 60);
        Patient patient6 = new Patient("Victor", "Warcry", "male", 52);
        hospital.registerPatient(patient4);
        hospital.registerPatient(patient5);
        hospital.registerPatient(patient6);
        logger.info("patients on patientLinkedList: ");
        hospital.printPatientList();

         */
        Human doc = (Human) hospital.recieveDoctor("Cardiologist");
        System.out.println(doc);

    }


}

