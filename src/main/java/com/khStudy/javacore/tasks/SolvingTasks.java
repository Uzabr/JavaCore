package main.java.com.khStudy.javacore.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolvingTasks {
    public static int[] sumOfElementsWhichEqualsToGivenNumber(int[] array, int number) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(number - array[ i ])) {
                result[0] = i;
                result[1] = map.get(number - array[ i ]);
            }
            else {
                map.put(array[i], i);
            }
        }
        return result;
    }
}
