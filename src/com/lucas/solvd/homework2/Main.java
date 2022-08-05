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


        //create patient
        Patient patient = new Patient("Lucas", "Gottar", "male", 18);
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
            Injury patientInjury = new Injury("heart", 7);
            patient.injury = patientInjury;

            //treatRightNow---> gravity of situation
            boolean treatRightNow = hospital.instantTreatment(patient.injury);

            if (treatRightNow) {
                int cost = Treatment.assignedDoctorCost(patient.injury.annoyance);
                patient.patientBalance = patient.patientBalance + cost;
                logger.info("you have been healed");

            } else {
                logger.info("your treatment can wait, make an appointment");
                scheduledDate = true;
            }

        } else if (scheduledDate) {
            //search free day on appointmentList
            int day = 1;
            int presentMonth = 8;
            Date d = new Date(day, presentMonth, 2022);
            boolean dayOccupied = hospital.searchDate(d);
            boolean makeAppointment = true;
            while (dayOccupied) {
                d.day++;
                if (d.day == 31) {
                    d.day = 1;
                    d.month++;
                    if (d.month == 12) {
                        logger.info("Come back next year, we are full");
                        dayOccupied = false;
                        makeAppointment = false;
                    }
                }
                dayOccupied = hospital.searchDate(d);
            }
            //if there's a free day
            if (makeAppointment) {
                Appointment appointment = new Appointment(patient, d);
                hospital.registerAppointment(appointment);
                if (patient.age < 12) {
                    logger.info("Your assigned doctor will be a Pediatrician");
                } else logger.info("Your assigned doctor will be assigned on the date's day");
            }
        }


    }
}
