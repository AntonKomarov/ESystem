package by.epamtc.komarov.task_4.exercise2;

public class Exercise {
    public static void main(String[] args) {

        int[][] array = new int[20][20];
        int index = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if(i == j) {
                    array[i][j] = (i + 1) * (j + 1 + index);
                } else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
