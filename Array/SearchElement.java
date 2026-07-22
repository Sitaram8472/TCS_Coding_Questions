// Problem Statement: Search an element in an array and return its position

// Examples:

// Example 1:
// Input: array[] = {1,2,3,4,5} k=3                                                                              Output: 2                                                                                                              Explanation: The answer is 2 because 3 is present at 2nd index.

// Example 2:
// Input: array[]={6,7,9,5,3,10} k=10
// Output: 5
// Explanation: The answer is 5 because 10 is present at 5th index.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class SearchElement {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int k = 2;

    int ans = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == k) {
        ans = i;
        break;
      }
    }

    System.out.println(ans == -1 ? -1 : ans);

  }
}
