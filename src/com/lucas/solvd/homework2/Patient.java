package com.lucas.solvd.homework2;

public class Patient extends Hospital{
    public String patientName;
    private String id;
    public int age;
    public String gender;


    @Override
    public int hashCode(){
        return patientName.hashCode()  + gender.hashCode();
    }

    @Override
    public String toString(){
        return "[Patient name : " + patientName + ", Age: " + age + ", Gender: " + gender +"]";
    }

    @Override
    public boolean equals (Object o){
        Patient p = (Patient) o;
        if (p.patientName==this.patientName && p.gender==this.gender){
            return  true;
        }
        else {
            return false;
        }
    }

}