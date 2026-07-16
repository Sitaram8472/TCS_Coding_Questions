// Problem Statement: Given an unsorted array, remove duplicates from the array.

// Examples
// Input: arr[]={2,3,1,9,3,1,3,9}
// Output: {2,3,1,9}
// Explanation: Removed all the duplicate elements.
// Input: arr[]={4,3,9,2,4,1,10,89,34}
// Output: {4,3,9,2,1,10,89,34}
// Explanation: Removed all the duplicate elements.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class RemoveDupliacte2 {
  public static void main(String[] args) {
    int[] arr = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };

    LinkedHashSet<Integer> s = new LinkedHashSet<>();
    for (int x : arr) {
      if (!s.contains(x)) {
        s.add(x);
      }
    }

    System.out.println(s);
  }
}
