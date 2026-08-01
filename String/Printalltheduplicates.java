// Problem Statement: Given a string of characters from a to z. Print the duplicate characters(which are occurring more than once) in the given string with their occurrences count.

// Examples
// Input: str= "sinstriiintng"
// Output: [i: 4, n: 3, s: 2, t: 2] 
// Explanation: In the above example, 's' occurs twice, 'i' occurs four times, 't' occurs twice and 'n' occurs thrice. 'r' and 'g' occur only one time and hence are not considered.
// Input: str= "abcdefg"
// Output: []
// Explanation: All characters occur once.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Printalltheduplicates {
  public static void main(String[] args) {

    String s = "sinstriiintng";

    HashMap<Character, Integer> map = new HashMap<>();

    for (char ch : s.toCharArray()) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    for (char x : map.keySet()) {
      if (map.get(x) > 1) {
        System.out.print(x + "" + map.get(x) + ", ");
      }

    }

  }

}
