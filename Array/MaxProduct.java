// Problem Statement: Given an array that contains both negative and positive integers, find the maximum product subarray.

// Examples
// Input: Nums = [1,2,3,4,5,0]
// Output: 120
// Explanation: 
// In the given array, 1×2×3×4×5 gives maximum product value.
// Input: Nums = [1,2,-3,0,-4,-5]
// Output: 20
// Explanation: 
// In the given array, (-4)×(-5) gives maximum product value.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class MaxProduct {
  public static void main(String[] args) {
    int[] arr = { 1, 2, -3, 0, -4, -5 };

    int maxp = arr[0];
    int minp = arr[0];
    int res = 0;

    for (int i = 1; i < arr.length; i++) {
      int curr = arr[i];

      if (curr < 0) {
        int temp = maxp;
        maxp = minp;
        minp = temp;
      }
      maxp = Math.max(curr, maxp * curr);
      minp = Math.min(curr, minp * curr);

      res = Math.max(res, maxp);
    }
    System.out.println(res);

  }
}
