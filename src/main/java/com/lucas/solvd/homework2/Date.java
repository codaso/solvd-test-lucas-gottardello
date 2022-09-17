package com.lucas.solvd.homework2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Date {
    Logger logger = LogManager.getLogger(Date.class);
    public int day;
    public int month;
    public int year;
    ArrayList<Date> dateList = new ArrayList<>();

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {

    }

    public Date searchFreeDate() {
        int currentMonth = getCurrentMonth();
        Date d = new Date(1, currentMonth, 2022);
        while (d.month < 13) {
            if (dateList.contains(d)) {
                d.day++;
            }
            if (d.day == 31) {
                d.day = 1;
                d.month++;
            } else if (!dateList.contains(d)) {

                logger.info(" [Your date with the doctor will be on day: " + d.day + ", month: " + d.month + ",year: " + d.year + "]");
                return d;
            }
            if (d.month == 12) {
                logger.info("We do not have an available day for you, come back next year");
                return null;
            }
        }
        return null;
    }

    int getCurrentMonth() {
        return 9;
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
