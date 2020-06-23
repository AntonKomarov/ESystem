package by.epamtc.komarov.task_3.exercise1;

public class Exercise1 {

    public static void main(String[] args) {

        int[] array = new int[]{13,5,322,7,8,223,6,8,22,8};
        int maxSum = 0;
        int sum;

        for (int i = 0; i < array.length / 2; i++) {

            sum = array[i] + array[array.length - i - 1];

            if (sum > maxSum) {
                maxSum = sum;
                System.out.println("maxSum: array[" + i + "]" + "array[" + (array.length - i - 1) + "] = " + maxSum);
            }
        }
    }
}
