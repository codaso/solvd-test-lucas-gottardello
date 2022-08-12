package com.lucas.solvd.homework2.exceptions;

public class InvalidAnnoyance {
    public void invalidAnnoyance(String str) {
        if (str != "mental" && str != "physical" && str != "heart" && str != "skin") {
            throw new IllegalArgumentException("Annoyance must be mental, physical, heart or skin");
        }
    }
}
