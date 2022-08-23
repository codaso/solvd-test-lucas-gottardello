package com.lucas.solvd.homework2.human.patient;

import com.lucas.solvd.homework2.exceptions.InvalidPainLevelException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Function;

public class Injury extends InvalidPainLevelException {
    private static Logger logger = LogManager.getLogger(Injury.class);

    public String annoyance;
    public int painLevel;


    public Injury(String annoyance, int painLevel) {
        try {
            if (invalidPain.apply(painLevel)) {
                throw new InvalidPainLevelException("Pain level must be between 1 & 10");
            }
        } catch (Exception e) {
            logger.info("Exception occurred: " + e);
        }
        this.annoyance = annoyance;
        this.painLevel = painLevel;
    }

    Function<Integer, Boolean> invalidPain = (t) -> (t > 10 || t < 1);
}
