package by.epamtc.komarov.task_3.exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise4 {
    public static void main(String[] args) {
        int[] array = new int[]{2,31,4,1,23,1,12,5,44,23,5,31,31,76,23};

        Map<Integer, Integer> sequence = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if(!sequence.containsKey(array[i])){
                sequence.put(array[i], 1);
            } else {
                sequence.put(array[i], sequence.get(array[i]) + 1);
            }
        }

        int max = 0;
        for (Map.Entry<Integer, Integer> element : sequence.entrySet()){
            if(element.getValue() > max)
                max = element.getValue();
            System.out.println("key: " + element.getKey() + " value:" + element.getValue());
        }

        int temp = Integer.MAX_VALUE;
        int temp2 = 0;

        for (Map.Entry<Integer, Integer> element : sequence.entrySet()){

            if (element.getValue() == max) {
                temp = Math.min(temp, element.getKey());

            }

                System.out.println("temp = " + temp + " temp2 = " + temp2);
        }






    }
}

