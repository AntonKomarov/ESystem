package com.komarov.module_4.task05;

public class Runner {
    static int number = 137;
    static int hundred = number/100;
    static int doubleNumber = number - (hundred*100);
    static int ten = doubleNumber / 10;
    static int unit = doubleNumber - (ten * 10);
    static int sum = 0, mult = 1;
    static int thousand;

    public static void main(String[] args) {
        System.out.println("mult = " + numberMult());
        System.out.println("sum = " + numberSum());
        System.out.println(lastToTheBegin());
    }

    static int numberSum(){ return sum = hundred + ten + unit; }

    static int numberMult(){ return  mult = hundred * ten * unit; }

    static int lastToTheBegin(){ return thousand = (unit * 1000) + number; }
}
