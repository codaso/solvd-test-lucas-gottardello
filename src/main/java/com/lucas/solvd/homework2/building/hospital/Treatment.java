package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.exceptions.InvalidAnnoyanceException;
import com.lucas.solvd.homework2.human.doctor.Doctors;
import com.lucas.solvd.homework2.human.patient.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Function;

public class Treatment {

    private Logger logger = LogManager.getLogger(Treatment.class);
    public Doctors[] doctorsEnum = Doctors.values();


    public int treat(String annoyance, Patient p) throws InvalidAnnoyanceException {

        if (invalidAnnoyance.apply(annoyance)) {
            throw new InvalidAnnoyanceException("Annoyance must be either mental, physical, heart or skin related");
        }
        if (annoyance.equals("heart")) {
            p.assignedDoctor = doctorsEnum[0].name();
            return doctorsEnum[0].ordinal();
        }
        if (annoyance.equals("regular inspection")) {
            p.assignedDoctor = doctorsEnum[1].name();
            return doctorsEnum[1].ordinal();
        }
        if (annoyance.equals("skin")) {
            p.assignedDoctor = doctorsEnum[2].name();
            return doctorsEnum[2].ordinal();
        }
        if (annoyance.equals("toddler")) {
            p.assignedDoctor = doctorsEnum[3].name();
            return doctorsEnum[3].ordinal();
        }
        if (annoyance.equals("mental")) {
            p.assignedDoctor = doctorsEnum[4].name();
            return doctorsEnum[4].ordinal();
        }
        if (annoyance.equals("physical")) {
            p.assignedDoctor = doctorsEnum[0].name();
            return doctorsEnum[5].ordinal();
        } else return -1;

    }

    Function<String, Boolean> invalidAnnoyance = (annoy) -> (!(annoy.equals("mental")) &&
            !(annoy.equals("physical")) && !(annoy.equals("heart")) && !(annoy.equals("skin"))
            && !(annoy.equals("toddler")) && !(annoy.equals("regular inspection")));


}



