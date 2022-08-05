package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.exceptions.CustomExceptions;
import com.lucas.solvd.homework2.exceptions.InvalidAnnoyanceException;
import com.lucas.solvd.homework2.human.doctor.specialty.Cardiologist;
import com.lucas.solvd.homework2.human.doctor.specialty.Dermatologist;
import com.lucas.solvd.homework2.human.doctor.specialty.Psychologist;
import com.lucas.solvd.homework2.human.doctor.specialty.Traumatologist;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Treatment extends CustomExceptions {

    private static Logger logger = LogManager.getLogger(Treatment.class);


    public static int assignedDoctorCost(String annoyance) {
        try {
            validateAnnoyance(annoyance);
        } catch (InvalidAnnoyanceException e) {
            logger.info("Exception ocurred:" + e);
        }

        if (annoyance == "mental") {
            Psychologist psychoDoc = new Psychologist("Laura", "Gutierrez");
            logger.info(psychoDoc.prescription());
            return psychoDoc.getSalary();
        } else if (annoyance == "physical") {
            Traumatologist traumaDoc = new Traumatologist("Aleksandr", "Solzhenitsyn");
            logger.info(traumaDoc.prescription());
            return traumaDoc.getSalary();
        } else if (annoyance == "heart") {
            Cardiologist cardioDoc = new Cardiologist("John", "Charles");
            logger.info(cardioDoc.prescription());
            return cardioDoc.getSalary();
        } else if (annoyance == "skin") {
            Dermatologist dermaDoc = new Dermatologist("Frederick", "Andrew");
            logger.info(dermaDoc.prescription());
            return dermaDoc.getSalary();
        } else {
            logger.info("empty");
            return 0;
        }
    }


}



