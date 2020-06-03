package com.komarov.module_4.task02;

public class Calendar {
    private final int[] DAYS = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    private int month = 1;
    private int day;

    void chooseNumberOfDay(int day){
        while(day > DAYS[0]){
            day -= DAYS[month++];
        }
      this.day = day;
    }

    @Override
    public String toString() {
        return "month= " + month + " day= "+ day;
    }
}