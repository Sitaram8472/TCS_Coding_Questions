// Problem Statement: Given two strings, write a program to remove characters from the first string which are present in the second string.

// Examples
// Input: str1 = “abcdef”, str2 = “cefz”
// Output: “abd”
// Explanation: The common characters in both strings are c, e, f.
// Input: str1 = “xyzpw”, str2 = "lmno" 
// Output: “xyzpw”
// Explanation: There are no common characters.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class RemoveCharactersstr1tostr2 {
  public static void main(String[] args) {
    String s1 = "abcdef", s2 = "cefz";

    HashSet<Character> set = new HashSet<>();

    for (char ch : s2.toCharArray()) {
      set.add(ch);
    }

    StringBuilder result = new StringBuilder();

    for (char ch : s1.toCharArray()) {
      if (!set.contains(ch)) {
        result.append(ch);
      }
    }

    System.out.println(result.toString());
    ;

  }

}
