package com.lucas.solvd.homework2.human;

import com.lucas.solvd.homework2.exceptions.InvalidPainLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Injury extends InvalidPainLevel {
    private static Logger logger = LogManager.getLogger(Injury.class);

    public String annoyance;
    public int painLevel;

    public Injury(String annoyance, int painLevel) {
        try {
            invalidPainLevel(painLevel);
        } catch (IllegalArgumentException e) {
            logger.info("Exception occurred: " + e);
        }
        this.annoyance = annoyance;
        this.painLevel = painLevel;
    }
}
