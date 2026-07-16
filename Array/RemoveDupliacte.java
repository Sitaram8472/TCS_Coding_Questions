// Remove Duplicates in-place from Sorted Array

// 29

// Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

// If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It doesn't matter what you leave beyond the first k elements.

// Examples
// Input: arr[]=[1,1,2,2,2,3,3]
// Output: [1,2,3,_,_,_,_]
// Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.
// Input: arr[]=[1,1,1,2,2,3,3,3,3,4,4]
// Output: [1,2,3,4,_,_,_,_,_,_,_]
// Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class RemoveDupliacte {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4 };

    if (arr.length == 1) {
      System.out.println(arr);
      return;
    }
    int i = 0;
    int j = 1;
    while (j < arr.length) {
      if (arr[i] != arr[j]) {
        i++;
        arr[i] = arr[j];
      }
      j++;
    }

    for (int k = 0; k <= i; k++) {
      System.out.print(arr[k] + " ");
    }
    for (int k = i; k < arr.length; k++) {
      System.out.print(",_");
    }

  }
}
