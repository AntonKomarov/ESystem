package com.komarov.module_4.task03;

class Runner {
    public static void main(String[] args) {
        RealNumbers number = new RealNumbers();
        number.setA(4);
        number.setB(-4);
        number.setC(6);

        if(number.getA() > number.getB() && number.getB() > number.getC()){
            number.doubleNumbers();
        } else {
            number.absNumbers();
        }
        System.out.println(number);
    }
}