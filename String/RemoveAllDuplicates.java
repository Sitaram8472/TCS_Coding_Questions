// Problem Statement: Given a String remove all the duplicate characters from the given String.

// Examples
// Input: s = "bcabc"
// Output: "bca" 
// Explanation: Duplicate characters 'b' and 'c' are removed
// Input: s = "cbacdcbc" 
// Output: "cbad"
// Explanation: Duplicate characters 'b' and 'c' are removed

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class RemoveAllDuplicates {
  public static void main(String[] args) {

    String s = "bcabc";

    StringBuilder sb = new StringBuilder();
    boolean[] seen = new boolean[26];

    for (int i = 0; i < s.length(); i++) {
      if (!seen[s.charAt(i) - 'a']) {
        seen[s.charAt(i) - 'a'] = true;
        sb.append(s.charAt(i));
      }
    }

    System.out.println(sb.toString());

  }

}
