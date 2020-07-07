package by.epamtc.komarov.matrix.exercise3;

import by.epamtc.komarov.matrix.printMatrix.PrintMatrix;

public class ExerciseThree {
    public static void main(String[] args) {

        int size = 5;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j <= matrix.length; j++) {

                if(i == j)
                matrix[i][j] = 1;
            }
        }

        PrintMatrix.print(matrix);
    }
}