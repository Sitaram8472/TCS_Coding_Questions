// Problem Statement: Given two strings, check if two strings are anagrams of each other or not.

// Examples
// Example 1:
// Input: CAT, ACT
// Output: true
// Explanation: Since the count of every letter of both strings are equal.

// Example 2:
// Input: RULES, LESRT 
// Output: false
// Explanation: Since the count of U and T  is not equal in both strings.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class anagrams {
  public static void main(String[] args) {
    String s1 = "rule";
    String s2 = "ulre";

    if (s1.length() != s2.length()) {
      System.out.println(false);
      return;
    }

    HashMap<Character, Integer> map = new HashMap<>();
    for (char ch : s1.toCharArray()) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    for (char ch : s2.toCharArray()) {
      if (!map.containsKey(ch) || map.get(ch) == 0) {
        System.out.println(false);
        return;
      }

      map.put(ch, map.get(ch) - 1);

    }
    System.out.println(true);

  }

}
