
// Rotate array by K elements : Block Swap Algorithm

// Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

// Input : N = 5, array[] = {1, 2, 3, 4, 5}, K = 2
// Output (Left Rotation) : {3, 4, 5, 1, 2}
// Explanation : After rotating left by 2, the first two elements move to the end.

// Input : N = 5, array[] = {1, 2, 3, 4, 5}, K = 2
// Output (Right Rotation) : {4, 5, 1, 2, 3}
// Explanation : After rotating right by 2, the last two elements move to the start.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Krotate {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int k = 2;

    int[] ans = new int[arr.length];

    int n = arr.length;

    k %= n;

    for (int i = 0; i < arr.length; i++) {
      ans[i] = arr[(i + k) % n];
    }

    for (int x : ans) {
      System.out.print(x + " ");
    }

  }
}
