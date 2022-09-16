package com.lucas.solvd.homework2.human.patient;

import com.lucas.solvd.homework2.exceptions.InvalidPainLevelException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Function;

public class Injury {
    private Logger logger = LogManager.getLogger(Injury.class);

    public String annoyance;
    public int painLevel;

    public Injury() {
        this.annoyance = "undefined";
        this.painLevel = 0;
    }


    public Injury(String annoyance, int painLevel) throws InvalidPainLevelException {

        if (invalidPain.apply(painLevel)) {
            throw new InvalidPainLevelException("Pain level must be between 1 & 10");
        }
        this.annoyance = annoyance;
        this.painLevel = painLevel;
    }

    Function<Integer, Boolean> invalidPain = (t) -> (t > 10 || t < 1);

    public int getPainLevel() {
        return this.painLevel;
    }

    public String getAnnoyance() {
        return this.annoyance;
    }


}
