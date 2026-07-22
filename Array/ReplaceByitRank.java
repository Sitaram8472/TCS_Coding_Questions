// Problem Statement: Given an array of N integers, the task is to replace each element of the array by its rank in the array.

// Examples
// Input: 20 15 26 2 98 6
// Output: 4 3 5 1 6 2
// Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so.

// Input: 1 5 8 15 8 25 9
// Output: 1 2 3 5 3 6 4
// Explanation :When sorted,the array is 1,5,8,8,9,15,25. So the rank of 1 is 1,rank of 5 is 2,rank of 8 is 3 and i
// so.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class ReplaceByitRank {
  public static void main(String[] args) {
    int[] arr = { 20, 15, 26, 2, 98, 6 };

    HashMap<Integer, Integer> map = new HashMap<>();
    int[] copy = arr.clone();
    Arrays.sort(copy);

    int rank = 1;
    for (int i = 0; i < arr.length; i++) {
      if (!map.containsKey(copy[i])) {
        map.put(copy[i], rank);
        rank++;
      }
    }

    int[] rankarray = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      rankarray[i] = map.get(arr[i]);
    }

    System.out.println(Arrays.toString(rankarray));
  }
}
