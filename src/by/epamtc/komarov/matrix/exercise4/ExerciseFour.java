package by.epamtc.komarov.matrix.exercise4;

import by.epamtc.komarov.matrix.print.PrintMatrix;

public class ExerciseFour {

    public static void main(String[] args) {

        int size = 6;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = (int) Math.pow(j + 1, i + 1);
            }
        }
        PrintMatrix.print(matrix);
    }
}
