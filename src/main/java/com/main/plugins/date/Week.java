package com.main.plugins.date;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * PackALunch
 * Created by sadra on 11/2/14.
 */
public class Week {

    private int weekNumber;

    public Week () {
        throw new IllegalArgumentException ("week number is missing.");
    }

    public Week (int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public Calendar getDate (int dayOfWeek) {
        Calendar weekDate = Calendar.getInstance();
        weekDate.set(Calendar.WEEK_OF_YEAR, weekNumber);
        weekDate.set(Calendar.DAY_OF_WEEK, dayOfWeek);
        return weekDate;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    /**
     * return weekday list starting sunday.
     * @return
     */
    public List<Day> getWeekList() {
        Calendar weekDate = Calendar.getInstance();
        weekDate.set(Calendar.WEEK_OF_YEAR, weekNumber);

        List  <Day> dayList = new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            weekDate.set(Calendar.DAY_OF_WEEK, i);

            Day day = new Day();
            day.setDate(weekDate.getTime());
            dayList.add(day);
        }

       return dayList;
    }
}
