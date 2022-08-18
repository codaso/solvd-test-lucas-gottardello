package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.exceptions.InvalidAnnoyanceException;
import com.lucas.solvd.homework2.human.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Treatment extends InvalidAnnoyanceException {

    private static Logger logger = LogManager.getLogger(Treatment.class);


    public Treatment(String annoyance, Patient p) {
        try {
            if (annoyance != "mental" && annoyance != "physical" && annoyance != "heart" && annoyance != "algo") {
                throw new InvalidAnnoyanceException("Annoyance must be either mental, physical, heart or skin related");
            }
        } catch (Exception e) {
            logger.info("Exception ocurred: " + e);
        }
        if (annoyance == "mental") {
            p.assignedDoctor = "Psychologist";
        } else if (annoyance == "physical") {
            p.assignedDoctor = "Traumatologist";
        } else if (annoyance == "heart") {
            p.assignedDoctor = "Cardiologist";
        } else if (annoyance == "skin") {
            p.assignedDoctor = "Dermatologist";
        }
    }


}



