package main.java.com.khStudy.javacore.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindingDuplicates {
    public static boolean findDuplicate(int[] array) {
        Arrays.sort(array);
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] == array[i + 1]) return true;
      }
        return false;
    }
}
