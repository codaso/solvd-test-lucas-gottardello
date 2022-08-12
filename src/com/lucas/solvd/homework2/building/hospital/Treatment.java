package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.exceptions.InvalidAnnoyance;
import com.lucas.solvd.homework2.human.Patient;
import com.lucas.solvd.homework2.human.doctor.specialty.Cardiologist;
import com.lucas.solvd.homework2.human.doctor.specialty.Dermatologist;
import com.lucas.solvd.homework2.human.doctor.specialty.Psychologist;
import com.lucas.solvd.homework2.human.doctor.specialty.Traumatologist;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Treatment extends InvalidAnnoyance {

    private static Logger logger = LogManager.getLogger(Treatment.class);


    public Treatment(String annoyance, Patient p) {
        try {
            invalidAnnoyance(annoyance);
        } catch (IllegalArgumentException e) {
            logger.info("Exception ocurred: " + e);
        }

        if (annoyance == "mental") {
            Psychologist psychoDoc = new Psychologist("Laura", "Gutierrez");
            logger.info(psychoDoc.prescription());
            p.patientBalance = p.patientBalance + psychoDoc.getSalary();
            psychoDoc = null;
        } else if (annoyance == "physical") {
            Traumatologist traumaDoc = new Traumatologist("Aleksandr", "Solzhenitsyn");
            logger.info(traumaDoc.prescription());
            p.patientBalance = p.patientBalance + traumaDoc.getSalary();
            traumaDoc = null;
        } else if (annoyance == "heart") {
            Cardiologist cardioDoc = new Cardiologist("John", "Charles");
            logger.info(cardioDoc.prescription());
            p.patientBalance = p.patientBalance + cardioDoc.getSalary();
            cardioDoc = null;
        } else if (annoyance == "skin") {
            Dermatologist dermaDoc = new Dermatologist("Frederick", "Andrew");
            logger.info(dermaDoc.prescription());
            p.patientBalance = p.patientBalance + dermaDoc.getSalary();
            dermaDoc = null;
        }
    }


}



