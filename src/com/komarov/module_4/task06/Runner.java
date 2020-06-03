package com.komarov.module_4.task06;

public class Runner {
    public static void main(String[] args) {
        // Обязательно просмотреть и решить.
        int a1 = 2, b = 3, an = 3, n;
        double sn = 0;
        for (n = 0; ; n+=b) {
            sn += ((a1 + an) * (n/2)) ;
            if(sn > Integer.MAX_VALUE)
                break;
            System.out.println(n);
        }
    }
}