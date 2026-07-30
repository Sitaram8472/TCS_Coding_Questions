// Problem Statement: Given an array of integers called nums, sort the array in non-decreasing order using the insertion sort algorithm and return the sorted array.

// A sorted array in non-decreasing order is an array where each element is greater than or equal to all preceding elements in the array.

// Examples
// Example 1:
// Input:
//   nums = [7, 4, 1, 5, 3]  
// Output:
//   [1, 3, 4, 5, 7]  
// Explanation:
//   The array is sorted in non-decreasing order: 1 ≤ 3 ≤ 4 ≤ 5 ≤ 7.

// Example 2:
// Input:
//   nums = [5, 4, 4, 1, 1]  
// Output:
//   [1, 1, 4, 4, 5]  
// Explanation:
//   The array is sorted in non-decreasing order: 1 ≤ 1 ≤ 4 ≤ 4 ≤ 5.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };

    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }

      arr[j + 1] = key;
    }

    System.out.println(Arrays.toString(arr));
  }
}
