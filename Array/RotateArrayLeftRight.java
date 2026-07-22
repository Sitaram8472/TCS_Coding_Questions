
// Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

// Examples
// Input : nums = [1, 2, 3, 4, 5, 6, 7], k = 2, right
// Output : [6, 7, 1, 2, 3, 4, 5]
// Explanation : rotate 1 step to the right: [7, 1, 2, 3, 4, 5, 6]
// rotate 2 steps to the right: [6, 7, 1, 2, 3, 4, 5] 

// Input : nums = [1, 2, 3, 4, 5, 6], k=2, left
// Output : [3, 4, 5, 6, 1, 2]
// Explanation :rotate 1 step to the left: [2, 3, 4, 5, 6, 1]
// rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class RotateArrayLeftRight {

  private static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }

  public static void rotate(int[] nums, int k, String direction) {
    // Edge case: If array is empty or has 1 element, no rotation needed
    if (nums == null || nums.length <= 1) {
      return;
    }

    int n = nums.length;

    // Normalize k to handle shifts larger than the array length
    k = k % n;

    // If k resolves to 0, no shift happens
    if (k == 0) {
      return;
    }

    if (direction.equalsIgnoreCase("right")) {
      // Right Rotation Steps:
      reverse(nums, 0, n - 1); // 1. Reverse entire array
      reverse(nums, 0, k - 1); // 2. Reverse first k elements
      reverse(nums, k, n - 1); // 3. Reverse remaining elements
    } else if (direction.equalsIgnoreCase("left")) {
      // Left Rotation Steps:
      reverse(nums, 0, k - 1); // 1. Reverse first k elements
      reverse(nums, k, n - 1); // 2. Reverse remaining elements
      reverse(nums, 0, n - 1); // 3. Reverse entire array
    } else {
      System.out.println("Invalid direction! Please choose 'left' or 'right'.");
    }
  }

  public static void main(String[] args) {
    // Test Case 1: Right Rotation
    int[] nums1 = { 1, 2, 3, 4, 5, 6, 7 };
    int k1 = 2;
    System.out.println("Original Array 1: " + Arrays.toString(nums1));
    rotate(nums1, k1, "right");
    System.out.println("Rotated " + k1 + " steps Right: " + Arrays.toString(nums1));
    System.out.println();

    // Test Case 2: Left Rotation
    int[] nums2 = { 1, 2, 3, 4, 5, 6 };
    int k2 = 2;
    System.out.println("Original Array 2: " + Arrays.toString(nums2));
    rotate(nums2, k2, "left");
    System.out.println("Rotated " + k2 + " steps Left: " + Arrays.toString(nums2));
  }
}
