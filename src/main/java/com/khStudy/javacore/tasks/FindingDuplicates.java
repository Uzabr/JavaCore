package main.java.com.khStudy.javacore.tasks;

public class FindingDuplicates {

    
    public static boolean findDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
          if (array[ i ] == array[ j ] )
              return true;
      }
        }
        return false;
    }
}
