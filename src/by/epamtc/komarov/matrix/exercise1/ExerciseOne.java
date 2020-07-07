package by.epamtc.komarov.matrix.exercise1;

import by.epamtc.komarov.matrix.printMatrix.PrintMatrix;

public class ExerciseOne {
    public static void main(String[] args) {

        int size = 10;
        int[][] matrix = new int[size][size];

        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix.length; column++) {

                matrix[line][column] = column + 1;

                if(line % 2 != 0){
                    matrix[line][column] = size - column;
                }
            }
        }

        PrintMatrix.print(matrix);
    }
}
