package com.komarov.module_4.task09;

public class Runner {
    public static void main(String[] args) {
        System.out.println(calculate(10));
    }

    //(1+2) * (1+2+3) *...* (1+2+...toValue)
    static long calculate(int toValue){
        long sum = 1;
        long preValue = sum;

        for (int i = 2; i <= toValue; i++) {
            preValue += i;
            sum = sum * preValue;
        }
        return sum;
    }
}
