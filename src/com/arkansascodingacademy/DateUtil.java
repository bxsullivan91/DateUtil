package com.arkansascodingacademy;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

@SuppressWarnings("WeakerAccess")
public class DateUtil
{
    //Return a LocalDate object for New Years of the given year
    public static LocalDate getNewYears(int year)
    {
        LocalDate date = LocalDate.of(year, 1, 1);
        return date;
    }

    //Return a LocalDate object for Christmas of the given year
    public static LocalDate getChristmas(int year)
    {
        LocalDate date = LocalDate.of(year, 12, 25);
        return date;
    }

    //In 1999 it is time to party
    //If the given year is 1999 return true
    public static boolean isPartyTime(LocalDate date)
    {
        boolean partyTime = false;
        int year = date.getYear();

        if(year == 1999)
        {
            partyTime = true;
        }

        return partyTime;
    }

    //After 1999 you are out of time
    //If the given year is after 1999 return true
    public static boolean isOutOfTime(LocalDate date)
    {
        boolean outOfTime = false;
        int year = date.getYear();

        if(year > 1999)
        {
            outOfTime = true;
        }

        return outOfTime;
    }

    //You took too long to order your soup
    //You cannot try again for one year
    //Return the given date one year from now
    public static LocalDate getSoupDay(LocalDate date)
    {
        LocalDate soupDay = date.plusYears(1);
        return soupDay;
    }

    //Return a LocalDate object for the next Christmas after the given date
    public static LocalDate getNextChristmas(LocalDate date)
    {
        int year = date.getYear();

        LocalDate christmas = LocalDate.of(year, 12, 25);

        if(date.isAfter(christmas) || date.isEqual(christmas))
        {
            year++;
        }

        LocalDate nextChristmas = LocalDate.of(year, 12, 25);

        return nextChristmas;
    }

    //Return the number of days until Christmas
    //If it is Christmas return the number of days until the next Christmas
    public static long getDaysUntilChristmas(LocalDate date)
    {
        LocalDate nextChristmas = getNextChristmas(date);

        long days = ChronoUnit.DAYS.between(date, nextChristmas);

        return days;
    }

    //Return a array of twelve ints holding the number of days in each month
    public static int[] daysInMonth(int year)
    {
        int[] daysOfMonth = new int[12];
        int startMonth = 1;

        for(int i = 0; i < daysOfMonth.length; i++)
        {
            LocalDate start = LocalDate.of(year, startMonth, 1);
            daysOfMonth[i] = start.lengthOfMonth();
            startMonth++;
        }
        return daysOfMonth;
    }
}
