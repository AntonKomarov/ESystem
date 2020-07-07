package by.epamtc.komarov.array.exercise5;

public class ExerciseFive {
    public static void main(String[] args) {

        int[] array = new int[]{4,6,4,2,34,5,23,2,352,12,6,7,6,3,453,6,34};
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length-1; i+=2) { max = Math.max(array[i], max); }
        for (int i = 1; i < array.length-2; i+=2) { min = Math.min(array[i], min); }

        System.out.println("sum: " + (max + min));
    }
}
