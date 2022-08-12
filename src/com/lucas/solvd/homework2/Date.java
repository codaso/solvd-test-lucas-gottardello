package com.lucas.solvd.homework2;

public class Date {
    public int day;
    public int month;
    public int year;
    public int dateID;

    //Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        dateID = 1;
    }

    //Getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


}
