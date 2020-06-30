package by.epamtc.komarov.module_4.task09;

public class Task09 {

    public static void main(String[] args) {
        System.out.println(calcMultOfFactorialSum(1, 10));
    }

    //(from +... toValue)
    public static long calcMultOfFactorialSum(int from, int toValue){

        long mult = 1;
        long preValue = 0;

        for (int i = from; i <= toValue; i++) {

            preValue += i;
            mult *= preValue; //10
        }

        return mult;
    }
}
