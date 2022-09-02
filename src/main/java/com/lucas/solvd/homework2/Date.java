package com.lucas.solvd.homework2;

public class Date {
    public int day;
    public int month;
    public int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object obj) {
        Date date = (Date) obj;
        if (date.day == this.day && date.month == this.month && date.year == this.year) {
            return true;
        }
        return false;
    }


}
