package com.komarov.module_4.task01;

class Expression {
    private double result;

    void calcTheValueOfEquation(double a, double b, double c){
        double firstPartOfExp = (b + Math.sqrt((b*b + 4 * a * c))) / (2 * a);
        double secondPartOfExp = (((a*a*a)*c) + (1/b*b));
        result = firstPartOfExp - secondPartOfExp;
    }

    void printResult(){
        System.out.println("result = " + getResult());
    }

    double getResult() {
        return result;
    }
}