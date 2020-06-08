package by.epamtc.module_4.task07;

public class Runner {

    public static void main(String[] args) {
        System.out.println(changeWholeWithFraction(345.674));
    }

    public static double changeWholeWithFraction(double number){
        return (number * 1000) % 1000 + (int) number / 1000.0;
    }
}
