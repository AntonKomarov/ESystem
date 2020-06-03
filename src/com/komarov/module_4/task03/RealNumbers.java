package com.komarov.module_4.task03;

class RealNumbers {
    private int a;
    private int b;
    private int c;

    void doubleNumbers(){
        setA(a*a);
        setB(b*b);
        setC(c*c);
    }

    void absNumbers(){
        setA(Math.abs(a));
        setB(Math.abs(b));
        setC(Math.abs(c));
    }

    @Override
    public String toString() { return "Numbers{" + "a=" + a + ", b=" + b + ", c=" + c + '}'; }

    int getC() { return c; }
    void setC(int c) { this.c = c; }

    int getB() { return b; }
    void setB(int b) { this.b = b; }

    int getA() { return a; }
    void setA(int a) { this.a = a; }
}
