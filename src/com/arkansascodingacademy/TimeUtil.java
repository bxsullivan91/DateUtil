package com.arkansascodingacademy;

import java.time.LocalDate;
import java.time.LocalTime;

@SuppressWarnings("WeakerAccess")
public class TimeUtil
{
    //Return true if it is after 12PM and before 4PM
    public static boolean isAfternoon(LocalTime time)
    {
        boolean afternoon = false;

        LocalTime noon = LocalTime.NOON;
        LocalTime four = LocalTime.of(16, 0);

        if(time.isAfter(noon) && time.isBefore(four))
        {
            afternoon = true;
        }

        return afternoon;
    }

    //Return true if it is after midnight and before 4AM
    public static boolean isAfterMidnight(LocalTime time)
    {
        boolean afterMidnight = false;

        LocalTime midnight = LocalTime.MIDNIGHT;
        LocalTime fourAM = LocalTime.of(4, 0);

        if(time.isBefore(fourAM) && time.isAfter(midnight))
        {
            afterMidnight = true;
        }

        return afterMidnight;
    }
}
