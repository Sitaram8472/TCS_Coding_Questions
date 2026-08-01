// Problem Statement: Given a string, print non-repeating characters of the string.

// Examples
// Example 1:
// Input:
//  string = "google"  
// Output:
//  l,e  
// Explanation:
//   Non-repeating characters are l, e.

// Example 2:
// Input:
//  string = "yahoo"  
// Output:
//  y,a,h  
// Explanation:
//   Non-repeating characters are y, a, h.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Nonrepeatingcharacters {
  public static void main(String[] args) {
    String s = "google";

    HashMap<Character, Integer> map = new HashMap<>();

    for (char ch : s.toCharArray()) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    for (char x : map.keySet()) {
      if (map.get(x) == 1) {
        System.out.print(x + " ");
      }

    }

  }

}
