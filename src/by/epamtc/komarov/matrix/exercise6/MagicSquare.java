package by.epamtc.komarov.matrix.exercise6;

import by.epamtc.komarov.matrix.printMatrix.PrintMatrix;

public class MagicSquare {
    public static void main(String[] args) {

        int size = 3;
        int[][] magicSquare = new int[size][size];
        int element = 1;
        int formula = size * 3 / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int line = (j - i + formula) % size;
                int column = (i * 2 - j + size) % size;

                System.out.println("line:" + line + " column:" + column + " element:" + element);
                magicSquare[line] [column] = element++;

            }
        }
        PrintMatrix.print(magicSquare);
    }
}
