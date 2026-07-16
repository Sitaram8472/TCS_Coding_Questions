// Problem Statement: You are given an array. The task is to reverse the array and print it.

// Examples
// Input: N = 5, arr[] = {5,4,3,2,1}
// Output: {1,2,3,4,5}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

// Input: N=6 arr[] = {10,20,30,40}
// Output: {40,30,20,10}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Resversearray {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40 };
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }

    System.out.println(Arrays.toString(arr));
  }
}
