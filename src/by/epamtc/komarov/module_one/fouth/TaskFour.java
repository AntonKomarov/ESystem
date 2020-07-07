package by.epamtc.komarov.module_one.fouth;

public class TaskFour {

    public static void main(String[] args) {
        System.out.println(calcFunction(15));
    }

    public static double calcFunction(double x){

        double functionResult = 0;

        if (x <= 13){
            functionResult = (-Math.pow(x, 3)) + 9;
        } else if (x > 13){
            functionResult = (-3) / (x + 1);
        }

        return functionResult;
    }
}
