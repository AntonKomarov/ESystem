package by.epamtc.komarov.matrix.exercise1;

import by.epamtc.komarov.matrix.printMatrix.PrintMatrix;

public class Exercise1 {
    public static void main(String[] args) {

        int size = 10;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = j+1;

                if(i % 2 != 0){
                    matrix[i][j] = size - j;
                }
            }
        }

        PrintMatrix.print(matrix);
    }
}
