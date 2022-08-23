package com.lucas.solvd.homework2;

import com.lucas.solvd.homework2.building.hospital.Hospital;
import com.lucas.solvd.homework2.human.doctor.Doctors;
import com.lucas.solvd.homework2.human.doctor.specialty.Clinician;
import com.lucas.solvd.homework2.human.patient.Injury;
import com.lucas.solvd.homework2.human.patient.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);
        Hospital hospital = new Hospital("Hospital Dr. Pedro Solanet");
        Doctors[] doctorsEnum = Doctors.values();
        hospital.loadDoctors();
        logger.info(hospital.getDocPrescription(0));
        logger.info(hospital.getDocPrescription(1));
        logger.info(hospital.getDocPrescription(2));
        logger.info(hospital.getDocPrescription(3));
        logger.info(hospital.getDocPrescription(4));
        logger.info(hospital.getDocPrescription(5));
        //---------------------------------------------
        //generate patients and add them to linkedListHuman
        /*
        Patient patient4 = new Patient("Jorge", "Lanata", "male", 65);
        Patient patient5 = new Patient("Patricia", "Bulrich", "female", 60);
        Patient patient6 = new Patient("Donald", "Trump", "male", 52);
        hospital.addPatient(patient4);
        hospital.addPatient(patient5);
        hospital.addPatient(patient6);
        logger.info("List of patients: ");
        logger.info("-------------------");
        hospital.printPatientList();
        logger.info("-------------------");

         */
        //----------------------------------------------
        //create patient, patient decides if check now or schedule a day
        //if check now--> check with regular doctor,patient describes problem
        //doctor decides if instant treatment, if yes-->treat, no-->make an appointment
        //create patient
        logger.info("Enter your name");
        String patientName = userInput.nextLine();
        logger.info("Enter your last-name");
        String patientLastname = userInput.nextLine();
        logger.info("Enter your gender");
        String patientGender = userInput.nextLine();
        logger.info("Enter your age");
        int patientAge = userInput.nextInt();
        Patient patient = new Patient(patientName, patientLastname, patientGender, patientAge);
        hospital.addPatient(patient);

        logger.info("do you want to make a scheduled appointment? y/n");
        boolean scheduledDate = false;
        String input = userInput2.nextLine();
        if (hospital.choice(input, (cho) -> cho.equals("y"))) scheduledDate = true;
        else if (hospital.choice(input, (cho) -> cho.equals("n"))) scheduledDate = false;
        else {
            logger.info("HALTING. Answer MUST be yes or no (y/n).");
            return;
        }

        if (!scheduledDate) {
            //guard attention, with regular doctor (clinic)
            Clinician clinic = new Clinician();
            logger.info(clinic.prescription());
            logger.info("What type of pain or trouble do you have?");
            logger.info("valid options: ");
            hospital.printDoctorsMainFocus(doctorsEnum);
            String trouble = userInput2.nextLine();
            logger.info("What level of pain from 1 to 10 would you give?");
            int painLevel = userInput.nextInt();
            Injury injury = new Injury(trouble, painLevel);
            patient.injury = injury;
            int docPos = hospital.treatment(injury.annoyance, patient);
            if (patient.urgency.apply(painLevel)) {
                int cost = hospital.getDocCost(docPos);
                patient.setPatientBalance(cost);
                logger.info("Your assigned doctor will be a: ");
                logger.info("--------------");
                logger.info(patient.assignedDoctor);
                logger.info("--------------");
                logger.info(patient.assignedDoctor + "'s prescription: " + hospital.getDocPrescription(docPos));

                logger.info("you have been healed, you need to pay the hospital a total of: ");
                logger.info(patient.printBalance(() -> patient.getPatientBalance()));
                hospital.deletePatient(patient);

            } else {
                logger.info("your treatment can wait, make an appointment");
                logger.info("Your assigned doctor will be a: ");
                logger.info(patient.assignedDoctor);
                logger.info("Doctor's available days are: ");
                logger.info(hospital.getAvailableDays(docPos));
                scheduledDate = true;
            }

        }
        if (scheduledDate) {
            Date date = hospital.searchFreeDate();
            hospital.registerDate(date);
            hospital.registerAppointment(patient, date);

        }

    }


}

