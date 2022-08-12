package com.lucas.solvd.homework2.exceptions;

public class InvalidPainLevel {
    public void invalidPainLevel(int n) {
        if (n > 10 || n < 1) {
            throw new IllegalArgumentException("Pain level must be between 1 & 10");
        }
    }
}
