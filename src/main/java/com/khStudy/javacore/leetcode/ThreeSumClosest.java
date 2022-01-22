package main.java.com.khStudy.javacore.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        long closestNumber  = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int next = i + 1;
            int last = nums.length - 1;
            while (next < last) {
                int sum = nums[i] + nums[ next ] + nums[ last ];
                if (Math.abs(target - sum) < Math.abs(target - closestNumber)) {
                    closestNumber = sum;
                }
                if (sum > target) {
                    last--;
                }
                else {
                    next++;
                }
            }
        }
        return (int) closestNumber;
    }
}
