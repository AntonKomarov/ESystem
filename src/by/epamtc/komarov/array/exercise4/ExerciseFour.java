package by.epamtc.komarov.array.exercise4;

import java.util.HashMap;
import java.util.Map;

public class ExerciseFour {
    public static void main(String[] args) {

        int[] array = new int[]{2, 31, 4, 1, 23, 1, 12, 5, 44, 23, 5, 31, 31, 76, 23};
        int minElement = findMinKeyMaxValue(calcSameKey(array));

        System.out.println("min from max element: " + minElement);

    }

    public static Map<Integer, Integer> calcSameKey(int[] array) {

        Map<Integer, Integer> number = new HashMap<>();

        for (int element : array) {
            if (!number.containsKey(element)) {
                number.put(element, 1);
            } else {
                number.put(element, number.get(element) + 1);
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
                minKey = element.getKey();
            }
        }
        return minKey;
    }
}


