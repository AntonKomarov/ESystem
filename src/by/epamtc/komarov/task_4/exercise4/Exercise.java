package by.epamtc.komarov.task_4.exercise4;

public class Exercise {
    public static void main(String[] args) {
        int n = 6;
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                array[i][j] = (int) Math.pow(j+1,i+1);

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
