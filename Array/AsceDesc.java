// Problem Statement: Rearrange a given array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

// Examples
// Input: [8 7 1 6 5 9]
// Output: [1 5 6 9 8 7]
// Explanation: First three elements are in the ascending order and next three elements are in the descending order.
// Input: [4 2 8 6 15 5 9 20]
// Output: [2 4 5 6 20 15 9 8]
// Explanation: First four elements are in the ascending order and next four elements are in the descending order.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class AsceDesc {
  public static void main(String[] args) {
    int[] arr = { 8, 7, 1, 6, 5, 9 };

    ArrayList<Integer> ans = new ArrayList<>();

    Arrays.sort(arr);

    for (int i = 0; i < arr.length / 2; i++) {
      ans.add(arr[i]);
    }

    ArrayList<Integer> curr = new ArrayList<>();

    for (int i = arr.length / 2; i < arr.length; i++) {
      curr.add(arr[i]);
    }

    Collections.sort(curr, Collections.reverseOrder());
    for (int x : curr) {
      ans.add(x);
    }

    System.out.println(ans);

  }
}
