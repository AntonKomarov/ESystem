package by.epamtc.komarov.task_4.exercise4;

import by.epamtc.komarov.task_4.printMatrix.PrintMatrix;

public class Exercise4 {
    public static void main(String[] args) {

        int size = 6;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = (int) Math.pow(j+1,i+1);
            }
        }
        PrintMatrix.print(matrix);
    }
}
