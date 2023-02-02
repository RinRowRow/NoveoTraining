package org.example;

import org.example.domen.ListNode;

import java.util.Map;
import java.util.TreeMap;

public class Exercise11 {
    /*
Trapping Rain Water

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.


Time complexity = O(n)

Space complexity O(1)
    */

    public static void main(String[] args) {
        System.out.println(trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static int trap(int[] height) {
        int count = 0;
        int begin = 0;
        int end = height.length - 1;
        int beginMax = 0;
        int endMax = 0;
        while (begin <= end) {
            beginMax = Math.max(beginMax, height[begin]);
            endMax = Math.max(endMax, height[end]);
            if (beginMax < endMax) {
                count += beginMax - height[begin++];
            } else {
                count += endMax - height[end--];
            }
        }
        return count;
    }
}
