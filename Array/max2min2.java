// Find Second Smallest and Second Largest Element in an array.

// Problem Statement: Given an array, find the second smallest and second
// largest element in the array. Print ‘-1’ in the event that either of them
// doesn’t exist.

// Example 1:
// Input:
// [1, 2, 4, 7, 7, 5]
// Output:

// Second Smallest : 2
// Second Largest : 5
// Explanation:
// The elements are sorted as 1, 2, 4, 5, 7, 7.
// Hence, the second smallest element is 2, and the second largest element is 5.

// Example 2:
// Input:
// [1]
// Output:

// Second Smallest : -1
// Second Largest : -1
// Explanation:
// Since there is only one element in the array, it is both the largest and
// smallest element.
// Therefore, there is no second smallest or second largest element present.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

/**
 * Q1
 */
public class max2min2 {
  public static void main(String[] args) {

    int[] arr = { 1, 2, 4, 5, 7, 7, -8, 1 };

    int min1 = 10000;
    int min2 = 10000;

    // 2nd smallest
    for (int i = 0; i < arr.length; i++) {
      if (min1 > arr[i]) {
        min2 = min1;
        min1 = arr[i];
      } else if (arr[i] > min1 && arr[i] < min2) {
        min2 = arr[i];
      }
    }
    System.out.println(min2);

    // 2nd largest
    int max1 = 0;
    int max2 = 0;

    for (int i = 0; i < arr.length; i++) {
      if (max1 < arr[i]) {
        max2 = max1;
        max1 = arr[i];
      } else if (arr[i] < max1 && arr[i] > max2) {
        max2 = arr[i];
      }
    }

    System.out.println(max2);

  }

}