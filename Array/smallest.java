// Problem Statement: Given an array, we have to find the smallest element in the array.

// Examples
// Example 1:
// Input:
//  arr[] = {2, 5, 1, 3, 0}  
// Output:
//  0  
// Explanation:
//   0 is the smallest element in the array.

// Example 2:
// Input:
//  arr[] = {8, 10, 5, 7, 9}  
// Output:
//  5  
// Explanation:
//   5 is the smallest element in the array.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class smallest {
  public static void main(String[] args) {
    int[] arr = { 5, 8, 9, 6, 2, 6, 9 };

    int small = 100000;
    for (int x : arr) {
      if (x < small) {
        small = x;
      }
    }

    System.out.println(small);
  }
}
