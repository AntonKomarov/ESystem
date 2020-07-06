package by.epamtc.komarov.module_4.task01;

public class TaskOne {

    public static void main(String[] args) {
        System.out.println(calcTheValueOfEquation(4,5,6));
    }

    public static double calcTheValueOfEquation(double a, double b, double c){

        double firstPartOfExp = (b + Math.sqrt(((b * b) + 4 * a * c))) / (2 * a);
        double secondPartOfExp = ((Math.pow(a, 3))*c) + (1/(b*b));

        return firstPartOfExp - secondPartOfExp;
    }
}
