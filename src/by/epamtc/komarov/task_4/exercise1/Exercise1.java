package by.epamtc.komarov.task_4.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        int n = 9;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = j+1;
                if(i % 2 != 0){
                    matrix[i][j] = matrix[i][j] - j;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
