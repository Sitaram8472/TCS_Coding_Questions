// Problem Statement: Given two strings text and pattern find the first occurrence of str1 in str2 if found print it’s index if not found print -1.

// Examples
// Example 1:
// Input:
//  str1 = "takeuforward", str2 = "forward"  
// Output:
//  5  
// Explanation:
//  The substring "forward" is present at index 5 in the string "takeuforward".

// Example 2:
// Input:
//  str1 = "hello", str2 = "az"  
// Output:
//  -1  
// Explanation:
//  The substring "az" is not present in the string "hello", so the output is -1.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class PositionofaSubstring {

  public static void main(String[] args) {

    String s1 = "takeuforward", s2 = "forward";
    int n = s1.length();
    int m = s2.length();

    for (int i = 0; i < n - m+1; i++) {
      if (s1.substring(i, i + m).equals(s2)) {
        System.out.println(i);
        return;
      }
    }

    System.out.println(-1);

  }
}
