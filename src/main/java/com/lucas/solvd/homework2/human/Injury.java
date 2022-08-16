package com.lucas.solvd.homework2.human;

import com.lucas.solvd.homework2.exceptions.InvalidPainLevelException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Injury extends InvalidPainLevelException {
    private static Logger logger = LogManager.getLogger(Injury.class);

    public String annoyance;
    public int painLevel;

    public Injury(String annoyance, int painLevel) {
        try {
            if (painLevel > 10 || painLevel < 1) {
                throw new InvalidPainLevelException("Pain level must be between 1 & 10");
            }
        } catch (Exception e) {
            logger.info("Exception occurred: " + e);
        }
        this.annoyance = annoyance;
        this.painLevel = painLevel;
    }
}
