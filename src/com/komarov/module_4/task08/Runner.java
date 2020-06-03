package com.komarov.module_4.task08;

public class Runner {
    static int x;
    static int a = 0;
    static int b = 20;
    static int c = 0;
    static int h = 3;
    static double y;

    public static void main(String[] args) {
        for (x = a; x <= b; x += h) {
            if(x == 15) {
                y = (x + c) * 2;
                System.out.println("x == 15: y=" + y);
            }
            else if (x != 15){
                y = (x - c) + 6;
                System.out.println("x != 15: y=" + y);
            }
        }
    }
}