// Problem Statement: Given a String, find the largest word in the string.

// Examples
// Example 1:
// Input:
//  string s = "Google Doc"  
// Output:
//  "Google"  
// Explanation:
//   "Google" is the largest word in the given string.

// Example 2:
// Input:
//  string s = "Microsoft Teams"  
// Output:
//  "Microsoft"  
// Explanation:
//   "Microsoft" is the largest word in the given string.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class largestword {

  public static void main(String[] args) {
    String s = "Microsoft Teams sitaram kumar";

    String[] str = s.split(" ");
    String max = str[0];

    for (String x : str) {
      if (x.length() > max.length()) {
        max = x;
      }
    }

    System.out.println(max);

  }

}
