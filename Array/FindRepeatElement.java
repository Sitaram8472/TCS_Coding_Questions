// Problem Statement: Find all the repeating elements present in an array.

// Examples
// Example 1:
// Input:

// Arr[] = [1,1,2,3,4,4,5,2]
// Output:

//  1,2,4
// Explanation:

//  1,2 and 4 are the elements which are occurring more than once.

// Example 2:
// Input:

//  Arr[] = [1,1,0]
// Output:
//  1
// Explanation:

//  Only 1 is occurring more than once in the given array.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class FindRepeatElement {
  public static void main(String[] args) {
    int arr[] = { 1, 1, 2, 3, 4, 4, 5, 2 };

    ArrayList<Integer> list = new ArrayList<>();
    HashSet<Integer> s = new HashSet<>();
    for (int x : arr) {
      if (!s.contains(x)) {
        s.add(x);
      } else {
        list.add(x);
      }
    }

    System.out.println(list);
  }
}
