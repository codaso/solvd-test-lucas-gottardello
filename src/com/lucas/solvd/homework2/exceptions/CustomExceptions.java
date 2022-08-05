package com.lucas.solvd.homework2.exceptions;

public class CustomExceptions {
    public void validatePain(int painLevel) throws InvalidPainException {
        if (painLevel < 1 || painLevel > 10) {
            throw new InvalidPainException("Pain level must be from 1 to 10");
        }
    }

    public static void validateAnnoyance(String str) throws InvalidAnnoyanceException {
        if (str != "mental" || str != "physical" || str != "heart" || str != "skin") {
            throw new InvalidAnnoyanceException("Annoyance must be mental, physical, heart or skin");
        } else System.out.println("good");
    }
}
