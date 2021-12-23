package main.java.com.khStudy.javacore.tasks;

import java.util.HashMap;

public class SingleNumber {
  public static void main(String[] args) {

    int[] arr = {1, 1,  2, 3, 3, 4, 4};
    System.out.println(secondWay(arr));
  }

  public static int singleNumberInArray(int[] nums) {
    int sNumber = nums[0];
    for (int i =1; i < nums.length; i++)
      sNumber = sNumber ^ nums[i];
    return  sNumber;
  }

  public static int secondWay(int[] nums) {
    long sum1 = 0;
    long sum2 = 0;

    HashMap<Integer, Integer> mapKeys = new HashMap<>();
    for (int num : nums) {
      if (! mapKeys.containsKey(num)) {
        sum1 += num;
        mapKeys.put(num, 1);
      }
      sum2 += num;
    }
    return (int) ((2 * sum1) - sum2);
  }

}
