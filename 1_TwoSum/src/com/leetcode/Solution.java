package com.leetcode;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] copy = nums.clone();
        Arrays.sort(nums);
        int a = 0;
        int b = nums.length - 1;
        int[] res = compare(nums, target, a, b);
        if (res == null) {
            return null;
        }
        boolean flaga = true;
        boolean flagb = true;
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] == nums[res[0]] && flaga) {
                a = i;
                flaga = false;
                continue;
            }
            if (copy[i] == nums[res[1]] && flagb) {
                b = i;
                flagb = false;
            }
        }

        return new int[]{a, b};
    }

    private int[] compare(int[] nums, int target, int a, int b) {
        if (a == b) {
            return null;
        }
        int result = nums[a] + nums[b];
        if (result == target) {
            return new int[]{a, b};
        } else if (result > target) {
            return compare(nums, target, a, b - 1);
        } else {
            return compare(nums, target, a + 1, b);
        }
    }
}
