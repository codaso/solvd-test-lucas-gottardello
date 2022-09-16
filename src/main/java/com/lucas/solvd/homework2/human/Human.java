package com.lucas.solvd.homework2.human;

import com.lucas.solvd.homework2.exceptions.InvalidAgeException;
import com.lucas.solvd.homework2.exceptions.InvalidGenderException;
import com.lucas.solvd.homework2.exceptions.InvalidNameException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Function;

public class Human {
    Function<Human, Human> human = (human) -> (human);
    private Logger logger = LogManager.getLogger(Human.class);
    public String name = "";
    public String lastname = "";
    public int age = 0;
    public String gender = "undefined";

    public Human() {
    }

    public Human(String name, String lastName, String gender, int age) throws InvalidNameException, InvalidAgeException, InvalidGenderException {

        if (invalidName.apply(name) || invalidName.apply(lastName)) {
            throw new InvalidNameException("Name should have at least 1 character");
        }
        if (invalidAge.apply(age)) {
            throw new InvalidAgeException("Age must be greater than 1");
        }
        if (!validGender.apply(gender)) {
            throw new InvalidGenderException("Gender must be 'male' or 'female' ");
        }
        this.name = name;
        this.lastname = lastName;
        this.gender = gender;
        this.age = age;

    }


    Function<String, Boolean> invalidName = (name) -> (name.equals(""));
    Function<Integer, Boolean> invalidAge = (age) -> (age < 1);
    Function<String, Boolean> validGender = (gender) -> (gender.equals("male") || gender.equals("female"));

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + lastname.hashCode() + +(int) Math.random() * 32000;
    }

    @Override
    public String toString() {
        return "Human";
    }

    @Override
    public boolean equals(Object o) {
        Human h = (Human) o;
        if (h.name == this.name && h.lastname == this.lastname && h.hashCode() == this.hashCode()) {
            return true;
        } else {
            return false;
        }
    }
}
