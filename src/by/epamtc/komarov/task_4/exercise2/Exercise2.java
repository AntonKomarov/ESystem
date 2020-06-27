package by.epamtc.komarov.task_4.exercise2;

import by.epamtc.komarov.task_4.printMatrix.PrintMatrix;

public class Exercise2 {
    public static void main(String[] args) {

        int size = 10;
        int[][] matrix = new int[size][size];
        int index = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if(i == j) {
                    matrix[i][j] = (i + 1) * (j + 1 + index);
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        PrintMatrix.print(matrix);
    }
}
