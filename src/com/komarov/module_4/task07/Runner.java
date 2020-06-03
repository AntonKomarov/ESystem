package com.komarov.module_4.task07;

public class Runner {
    public static void main(String[] args) {
        System.out.println(changeParts(345.674));
    }

    static double changeParts(double number){
        return (number * 1000) % 1000 + (int) number / 1000.0;
    }
}
