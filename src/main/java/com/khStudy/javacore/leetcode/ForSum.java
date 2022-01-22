package main.java.com.khStudy.javacore.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ForSum {

  public static void main(String[] args) {
      long time = System.nanoTime();
    int[] a = {1,0,-1,0,-2,2};
    System.out.println(forSum(a, 0));
    System.out.println((System.nanoTime() - time) / 1000_000);
  }

    public static List<List<Integer>> forSum(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<>();

        if (nums == null || nums.length < 4) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
//            if (i != 0 && nums[i] == nums[ i -1 ]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
//                if (j != 0 && nums[j] == nums[ j -1 ]) continue;
                int k = j + 1;
                int l = nums.length - 1;
        while (k < l) {
          if (nums[i] + nums[j] + nums[k] + nums[l] < target) k++;
          else if (nums[i] + nums[j] + nums[k] + nums[l] > target) l--;
          else {
            List<Integer> list = new LinkedList<>();
            list.add(nums[i]);
            list.add(nums[j]);
            list.add(nums[k]);
            list.add(nums[l]);
            result.add(list);
            k++;
            l--;
            while (k < l && nums[l] == nums[l + 1]) {
              l--;
            }
            while (k < l && nums[k] == nums[k - 1]) {
              k++;
            }
          }
        }
        while (j + 1 < nums.length && nums[j] == nums[j+1] ) j++;
            }
            while (i + 1 < nums.length && nums[i] == nums[ i + 1 ]) i++;
        }
        return result;
    }
}
