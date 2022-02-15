package com.example.firstspringproject.services;

public class DayOfWeekCalc {


    public int whatDayIsIt() {

        int q = 18;
        int m = 14;
        int j = (2021 / 100);
        int k = (2021 % 100);

        double f = Math.floor(13* (m + 1) / 5);

        double h = (q + f + k + Math.floor(k / 4) + Math.floor(j / 4) - (2 * j)) % 7;

        int d = (int) ((h + 5) % 7) + 1;

        return d;
    }



}
