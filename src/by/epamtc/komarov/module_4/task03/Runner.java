package by.epamtc.komarov.module_4.task03;

public class Runner {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 7;

        if((a > b) && (b > c)) {
            a = a * 2;
            b = b * 2;
            c = c * 2;
        }
        else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}