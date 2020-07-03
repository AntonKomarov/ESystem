package by.epamtc.komarov.array.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {

        int[] array = new int[]{2, 5, 79, 2, 83, 42, 6, 7, 87, 8, 93};

        print(toHalfArray(array));
    }

    public static List<Integer> toHalfArray(int[] array){

        List<Integer> maxElement = new ArrayList<>();

        for (int i = 0; i < array.length-1; i+= 2) {
            maxElement.add(Math.max(array[i], array[i+1]));
        }
        if (array.length % 2 != 0){
            maxElement.add(array[array.length-1]);
        }

        return maxElement;
    }

    public static void print(List<Integer> list){

        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }
}
