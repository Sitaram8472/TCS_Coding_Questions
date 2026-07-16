// Problem Statement: Find all the non-repeating elements for a given array. Outputs can be in any order.

// Examples
// Example 1:
// Input:

//  Nums = [1,2,-1,1,3,1]
// Output:

//  2,-1,3
// Explanation:

//  1 is the only element in the given array which occurs thrice in the array. -1,2,3 occurs only once and hence, these are non-repeating elements of the given array.

// Example 2:
// Input:

//  Nums = [1,2,3]
// Output:

//  1,2,3
// Explanation:

//  All elements present in the array occur once. Hence, every element is non-repeating.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class FindNon_repeat {
  public static void main(String[] args) {
    int[] arr = { 1, 2, -1, 1, 3, 1 };
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int x : arr) {
      map.put(x, map.getOrDefault(x, 0) + 1);
    }

    for (int x : map.keySet()) {
      if (map.get(x) == 1) {
        System.out.print(x + " ");
      }
    }
  }
}
