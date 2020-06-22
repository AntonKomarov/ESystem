package by.epamtc.komarov.task_3.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {

        int[] container = new int[]{2, 5, 79, 2, 83, 42, 6, 7, 87, 8, 93};

        System.out.println(createSequence(container));

    }

    public static List createSequence(int[] array){
        List<Integer> wholeSequence = new ArrayList<>();

        for (int i = 0; i < array.length-1; i+= 2) {
            wholeSequence.add(Math.max(array[i], array[i+1]));
        }
        if (array.length % 2 != 0){
            wholeSequence.add(array[array.length-1]);
        }

        return wholeSequence;
    }
}
