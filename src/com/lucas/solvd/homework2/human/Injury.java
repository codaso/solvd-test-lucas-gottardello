package com.lucas.solvd.homework2.human;

import com.lucas.solvd.homework2.exceptions.CustomExceptions;
import com.lucas.solvd.homework2.exceptions.InvalidPainException;

public class Injury extends CustomExceptions {

    public String annoyance;
    public int painLevel;

    public Injury(String annoyance, int painLevel) {
        try {
            validatePain(painLevel);
        } catch (InvalidPainException e) {
            System.out.println("Exception occurred: " + e);
        }
        this.annoyance = annoyance;
        this.painLevel = painLevel;
    }
}
