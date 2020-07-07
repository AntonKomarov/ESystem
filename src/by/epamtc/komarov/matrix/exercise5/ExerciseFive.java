package by.epamtc.komarov.matrix.exercise5;

import by.epamtc.komarov.matrix.printMatrix.PrintMatrix;

public class ExerciseFive {

    public static void main(String[] args) {

        int size = 3;

        int[][] firstMatrix = new int[][]
                {
                        {1,2},
                        {3,4},
                        {5,6}
                };
        int[][] secondMatrix = new int[][]
                {
                        {7,8,9},
                        {10,11,12}
                };

        int[][] resultMatrix = new int[size][size];

        // время выпонения О(n^3)
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < 2; k++) {

                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        PrintMatrix.print(resultMatrix);

    }
}
