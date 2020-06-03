package com.komarov.module_4.task04;

public class Function {
    private double function;

    void calculateFunctionWhenX(double x){
        if (x <= 13){
            setFunction(-(x*x*x) + 9);
        }
        else if (x > 13){
            setFunction(-3/(x+1));
        }
    }

    public void setFunction(double function) { this.function = function; }
    public double getFunction() { return function; }

    @Override
    public String toString() {
        return "Function f(x) = " + function;
    }
}