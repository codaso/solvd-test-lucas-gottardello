package com.lucas.solvd.homework2;

import com.lucas.solvd.homework2.building.hospital.Appointment;
import com.lucas.solvd.homework2.building.hospital.Hospital;
import com.lucas.solvd.homework2.building.hospital.Treatment;
import com.lucas.solvd.homework2.exceptions.InvalidPainException;
import com.lucas.solvd.homework2.human.Injury;
import com.lucas.solvd.homework2.human.Patient;
import com.lucas.solvd.homework2.human.doctor.specialty.Clinician;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws InvalidPainException {
        Hospital hospital = new Hospital("BestHospital");


        //create patient
        Patient patient = new Patient("Lucas", "Gottar", "male", 18);
        //add patient to patientList
        hospital.registerPatient(patient);
        //does the patient want to make a scheduled appointment(input)?
        //if no, then -->
        boolean scheduleDate = false;
        if (!scheduleDate) {
            //guard attention with regular doctor (clinic)
            Clinician clinic = new Clinician("Camila", "Perez");
            logger.info(clinic.prescription());
            //patient describes the problem
            Injury patientInjury = new Injury("heart", 7);
            patient.injury = patientInjury;

            //treatRightNow---> gravity of situation
            boolean treatRightNow = hospital.instantTreatment(patient.injury);

            if (treatRightNow) {
                int cost = Treatment.assignedDoctorCost(patient.injury.annoyance);
                patient.patientBalance = patient.patientBalance + cost;

            } else {
                logger.info("your treatment can wait, make an appointment");
                scheduleDate = true;
            }

        } else if (scheduleDate) {
            //search free day on appointmentList
            int day = 1;
            int presentMonth = 8;
            boolean reservation = true;
            boolean dayOccupied = hospital.searchDate(day);
            while (dayOccupied) {
                day++;
                if (day == 31) {
                    day = 1;
                    presentMonth++;
                    if (presentMonth == 12) {
                        logger.info("Come back next year, we are full");
                        dayOccupied = false;
                        reservation = false;
                    }
                }
                dayOccupied = hospital.searchDate(day);
            }
            //if there's a free day
            if (!reservation) {
                Date date = new Date(day, presentMonth, 2022);
                Appointment appointment = new Appointment(patient, date);
                hospital.registerAppointment(appointment);
                if (patient.age < 12) {
                    logger.info("Your assigned doctor will be a Pediatrician");
                }
            }
        }


    }
}
