package by.epamtc.komarov.task_4.exercise5;

public class Exercise5 {

    public static void main(String[] args) {

        int line = 2;
        int columns = 3;

        int[][] arrayFirst = new int[][]
                {
                        {1,2},
                        {3,4},
                        {5,6}
                };
        int[][] arraySecond = new int[][]
                {
                        {7,8,9},
                        {10,11,12}
                };

        int[][] arrayThird = new int[columns][columns];

        // время выпонения О(n^3)
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < line; k++) {
                    arrayThird[i][j] += arrayFirst[i][k] * arraySecond[k][j];
                }
            }
        }

        printMatrix(arrayThird);

    }

    public static void printMatrix(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
