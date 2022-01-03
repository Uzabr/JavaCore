package main.java.com.khStudy.javacore.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new LinkedList<>();
    for (int i = 0; i + 2 < nums.length ; i++) {
        if (i > 0 && nums[i] == nums[ i -1 ]) {
            continue;
        }
        if(nums[i] + nums[ i + 1 ] + nums[ i + 2 ] > 0) {
            continue;
        }
        if (nums[i] + nums[ i -1 ] + nums[ i -2 ] < 0) {
            continue;
        }
        int k = nums.length -1;
        for (int j = i + 1; j < k; j++) {
            while(j < k -1 && nums[i] + nums[j] + nums[k] > 0) {
                k--;
            }
            if(nums[i] + nums[j] + nums[k] == 0) {
                if (result.isEmpty() || nums[i] != result.get(result.size() - 1).get(0) ||
                nums[j] != result.get(result.size() - 1).get(1) ||
                nums[k] != result.get(result.size() - 1).get(2)) {
                    result.add(List.of(nums[i], nums[j], nums[k]));
                }
            }
        }
    }
    return result;
    }
}
