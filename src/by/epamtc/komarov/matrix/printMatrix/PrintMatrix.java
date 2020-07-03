package by.epamtc.komarov.matrix.printMatrix;

public class PrintMatrix {

    public static void print(int[][] matrix){

        for (int[] line : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(line[j] + " ");
            }
            System.out.println();
        }
    }
}
