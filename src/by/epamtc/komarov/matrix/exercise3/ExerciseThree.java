package by.epamtc.komarov.matrix.exercise3;

import by.epamtc.komarov.matrix.print.PrintMatrix;

public class ExerciseThree {

    public static void main(String[] args) {

        int size = 8;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 1;
            }
        }

        int index = 1;

        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 0; j < index; j++) {

                matrix[i][j] = 0;
            }

            if (i < matrix.length/2){
                ++index;
            }
            else {
                --index;
            }
        }
        PrintMatrix.print(matrix);

        System.out.println();

        int indexSecond = matrix.length - 1;

        for (int i = matrix.length - 1; i >= 1; i--) {
            for (int j = matrix.length - 1; j >= indexSecond; j--) {

                matrix[i][j] = 0;
            }

            if (i > matrix.length / 2){
                --indexSecond;
            }
            else {
                ++indexSecond;
            }
        }

        PrintMatrix.print(matrix);

    }
}