// Problem Statement: Given a string, return the character that occurs the maximum number of times in the string. If the maximum occurrence of two or more characters is the same, return any one of them.

// Examples
// Input: str = “takeuforward”
// Output: a
// Explanation: 
// The character 'a' and 'r’ have the same  maximum occurrence i.e 2. Hence we can print any one of them.
// Input: str = "apple"
// Output: p
// Explanation: 
// The character 'p' have the maximum occurrence i.e 2.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Maximumoccurring {
  public static void main(String[] args) {
    String s = "diedddd";

    HashMap<Character, Integer> map = new HashMap<>();

    for (char ch : s.toCharArray()) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    char ch = ' ';
    int max = 0;
    for (char x : map.keySet()) {
      if (map.get(x) > max) {
        ch = x;
        max = map.get(x);
      }
    }
    System.out.println(ch);

  }

}
