package com.lucas.solvd.homework2.human;

import com.lucas.solvd.homework2.exceptions.InvalidAgeException;
import com.lucas.solvd.homework2.exceptions.InvalidGenderException;
import com.lucas.solvd.homework2.exceptions.InvalidNameException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Human {
    private static Logger logger = LogManager.getLogger(Human.class);
    public String name;
    public String lastname;
    public int age;
    public String gender;

    public Human() {
    }

    public Human(String name, String lastName, String gender, int age) {
        try {
            if (name == "" || lastName == "") {
                throw new InvalidNameException("Name should have at least 1 character");
            }
            if (age < 1) {
                throw new InvalidAgeException("Age must be greater than 1");
            }
            if (gender != "male" && gender != "female") {
                throw new InvalidGenderException("Gender must be 'male' or 'female' ");
            }
        } catch (InvalidGenderException | InvalidAgeException | InvalidNameException e) {
            logger.error(e);
        }

        this.name = name;
        this.lastname = lastName;
        this.gender = gender;
        this.age = age;
    }

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
        return "Human Class = [Name : " + name + ", Last-name: " + lastname + "]";
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
