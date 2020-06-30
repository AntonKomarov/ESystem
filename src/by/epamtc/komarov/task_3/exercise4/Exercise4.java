package by.epamtc.komarov.task_3.exercise4;

import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
    public static void main(String[] args) {

        int[] array = new int[]{2, 31, 4, 1, 23, 1, 12, 5, 44, 23, 5, 31, 31, 76, 23};
        int minElement = findMinKeyMaxValue(calcSameKey(array));

        System.out.println("min from max element: " + minElement);

    }

    public static Map<Integer, Integer> calcSameKey(int[] array) {

        Map<Integer, Integer> number = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (!number.containsKey(array[i])) {
                number.put(array[i], 1);
            } else {
                number.put(array[i], number.get(array[i]) + 1);
            }
        }
        return number;
    }

    public static int findMinKeyMaxValue(Map<Integer, Integer> hashMap) {

        int maxValue = 0;
        int minKey = 0;

        for (Map.Entry<Integer, Integer> element : hashMap.entrySet()) {
            if (element.getValue() > maxValue)
                maxValue = element.getValue();
        }

        for (Map.Entry<Integer, Integer> element : hashMap.entrySet()) {
            if (element.getValue() == maxValue) {
                return minKey = element.getKey();
            }
        }
        return minKey;
    }
}


