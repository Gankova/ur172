package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// работа с датами
public class Data {
    public static void main(String []args){
        Date d = new Date();
        // в объект d записалась текущая дата ОС
        System.out.println(d);
        System.out.println(d.getTime());
        d.setTime(12121212154545L);
        System.out.println(d);


        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(Calendar.DAY_OF_MONTH,25);
        calendar.set(Calendar.YEAR,1998);
        calendar.set(Calendar.MONTH,7);// номер месяца начинается с нуля, выведет август
        System.out.println(calendar.getTime());

        calendar.add(Calendar.DAY_OF_MONTH,10);
        calendar.add(Calendar.HOUR_OF_DAY,6);
        calendar.add(Calendar.YEAR,-10);
        System.out.println(calendar.getTime());
        int hours =calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(hours);

        calendar.isLeapYear(1984);

    }
}
