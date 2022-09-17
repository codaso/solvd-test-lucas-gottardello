package com.lucas.solvd.homework2;

import com.lucas.solvd.homework2.building.hospital.Appointment;
import com.lucas.solvd.homework2.building.hospital.Hospital;
import com.lucas.solvd.homework2.building.hospital.OffMenu;
import com.lucas.solvd.homework2.exceptions.*;
import com.lucas.solvd.homework2.human.doctor.specialty.Clinician;
import com.lucas.solvd.homework2.human.patient.Injury;
import com.lucas.solvd.homework2.human.patient.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);
        Hospital hospital = new Hospital("Hospital Dr. Pedro Solanet");
        hospital.loadDoctors();
        hospital.generatePatients();
        try {
            OffMenu offMenu = new OffMenu(hospital);
        } catch (InvalidAgeException | InvalidNameException | InvalidGenderException e) {
            e.printStackTrace();
        }
        //----------------------------------------------
        //create patient, patient decides if check now or schedule a day
        //if check now--> check with regular doctor,patient describes problem
        //doctor decides if instant treatment, if yes-->treat, no-->make an appointment
        //create patient
        logger.info("MAIN PROGRAM");
        logger.info("Enter your name");
        String patientName = userInput.nextLine();
        logger.info("Enter your last-name");
        String patientLastname = userInput.nextLine();
        logger.info("Enter your gender");
        String patientGender = userInput.nextLine();
        logger.info("Enter your age");
        int patientAge = userInput.nextInt();
        Patient patient = new Patient();
        try {
            Patient patientAux = new Patient(patientName, patientLastname, patientGender, patientAge);
            patient = patientAux;
            patientAux = null;
        } catch (InvalidAgeException | InvalidNameException | InvalidGenderException e) {
            e.printStackTrace();
        }
        hospital.addPatient(patient);

        logger.info("do you want to make a scheduled appointment?  \ny/n");
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
            logger.info("What type of annoyance or trouble do you have?");
            logger.info("valid options: ");
            hospital.printDoctorsMainFocus();
            String trouble = userInput2.nextLine();
            logger.info("What level of pain from 1 to 10 would you give?");
            int painLevel = userInput.nextInt();
            int docPos = -1;
            try {
                Injury injury = new Injury(trouble, painLevel);
                patient.injury = injury;
                docPos = hospital.treatment(patient.injury.annoyance, patient);
            } catch (InvalidPainLevelException | InvalidAnnoyanceException e) {
                e.printStackTrace();
            }
            if (patient.urgency.apply(painLevel)) {
                int cost = hospital.getDocCost(docPos);
                patient.setPatientBalance(cost);
                logger.info("Your assigned doctor will be a: ");
                logger.info("--------------");
                logger.info(patient.assignedDoctor);
                logger.info("--------------");
                logger.info(patient.assignedDoctor + "'s prescription: " + hospital.getDocPrescription(docPos));

                logger.info("you have been healed, you need to pay the hospital a total of: ");
                logger.info(patient.getPatientBalance());
                hospital.deletePatient(patient);

            } else {
                logger.info("your treatment can wait, make an appointment");
                logger.info("Your assigned doctor will be a: ");
                logger.info(patient.assignedDoctor);
                logger.info("Doctor's available day(s) are: ");
                logger.info(hospital.getDocAvailableDays(docPos));
            }

        }
        if (scheduledDate) {
            Date date = new Date();
            date = date.searchFreeDate();
            Appointment a = new Appointment(patient, date);
            a.registerAppointment(a);
        }
    }

}


