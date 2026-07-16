// Find Median of the given Array

// 0

// Problem Statement: Given an unsorted array, find the median of the given array.

// What is a Median?
// Median is defined as the value which is present in the middle for a series of values. Note, in order to find the median of an array of integers, we must make sure they are sorted.
// Example 1:
// Input:
//  [2,4,1,3,5]
// Output:
//  3

// Example 2:
// Input:
//  [2,5,1,7]
// Output:
//  3.5

//  The problem requires us to simply implement the mathematical formula programmatically. Hence, we need to make sure that the array is sorted and calculate the answer based on whether n is odd or even.

// Approach : 

// Sort the array in ascending order
// Check whether n is odd or even
// Calculate the median accordingly. Here’s a quick demonstration of the same

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class Medium {
  public static void main(String[] args) {
    int[] arr = { 2, 5, 1, 7 };

    int n = arr.length;
    Arrays.sort(arr);
    if (n % 2 == 0) {

      int d1 = arr[(n / 2) - 1];
      int d2 = arr[n / 2];
      System.out.println((double) (d1 + d2) / 2);
    } else {
      System.out.println(arr[n / 2]);
    }
  }
}
