// Problem Statement: Given an array of pairs, find all the symmetric pairs in the array.

// Examples
// Example 1:
// Input:
//  (1,2),(2,1),(3,4),(4,5),(5,4)
// Output:
//  (2,1) (5,4)
// Explanation:
//  Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.

// Example 2:
// Input:
//  (1,5),(2,3),(4,2),(5,1),(2,4)
// Output:
//  (2,4) (5,1)
// Explanation:
//  Since (1,5) and (2,4) are symmetric pairs and (5,1) and (4,2) are symmetric pairs.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

/**
 * SummetricPair
 */
public class SummetricPair {

  public static void main(String[] args) {
    int[][] arr = { { 1, 2 }, { 2, 1 }, { 4, 5 }, { 5, 4 }, { 8, 9 } };

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      int first = arr[i][0];
      int second = arr[i][1];

      if (map.containsKey(second) && map.get(second) == first) {
        System.out.print("(" + first + " " + second + ") ");
      } else {
        map.put(first, second);
      }
    }

    // System.out.println(map);

  }
}