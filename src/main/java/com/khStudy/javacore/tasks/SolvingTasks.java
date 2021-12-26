package main.java.com.khStudy.javacore.tasks;

import java.util.Arrays;

public class SolvingTasks {
    public static int[] sumOfElementsWhichEqualsToGivenNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number)
                    return new int[] {i, j};
            }
        }
        return new int[]{};
    }
}
