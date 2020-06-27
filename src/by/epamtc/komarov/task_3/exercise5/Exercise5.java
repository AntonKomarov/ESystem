package by.epamtc.komarov.task_3.exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        int[] array = new int[]{4,6,4,2,34,5,23,2,352,12,6,7,6,3,453,6,34};

        int max = 0;
        int min = array[1];

        for (int i = 0; i < array.length-1; i+=2) { max = Math.max(array[i], max); }
        for (int i = 1; i < array.length-2; i+=2) { min = Math.min(array[i], min); }

        System.out.println("max from even: " + max);
        System.out.println("min from uneven: " + min);

    }
}
