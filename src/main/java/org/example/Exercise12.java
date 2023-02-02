package org.example;

import java.util.HashMap;
import java.util.Map;

public class Exercise12 {
    /*
Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.


Time complexity = O(n)

Space complexity O(n)
    */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexByNumber = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = indexByNumber.get(target - nums[i]);
            if (index != null) {
                return new int[]{index, i};
            }
            indexByNumber.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
