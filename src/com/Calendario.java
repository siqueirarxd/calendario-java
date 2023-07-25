package com;


import java.util.*;


class Result {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String res = "";
        switch(dayOfWeek){
            case 1:
            res = "SUNDAY";
            break;
            case 2:
            res = "MONDAY";
            break;
            case 3:
            res ="TUESDAY";
            break;
            case 4:
            res = "WEDNESDAY";
            break;
            case 5:
            res = "THURSDAY";
            break;
            case 6:
            res ="FRIDAY";
            break;
            case 7:
            res ="SATURDAY";
            break;
        }
        return res;
    }

}
