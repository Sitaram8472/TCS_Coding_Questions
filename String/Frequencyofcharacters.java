// Problem Statement: Problem Statement: Given a string, calculate the frequency of characters in a string.

// Examples
// Example 1:
// Input: takeuforward
// Output: a2 d1 e1 f1 k1 o1 r2 t1 u1 w1 
// Explanation: Count of every character of string is printed.

// Example 2:
// Input: articles
// Output: a1 c1 e1 i1 l1 r1 s1 t1 
// Explanation: Count of every character of string is printed.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Frequencyofcharacters {
  public static void main(String[] args) {
    String s = "takeuforward";

    HashMap<Character, Integer> map = new HashMap<>();

    for (char ch : s.toCharArray()) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    for (char x : map.keySet()) {
      System.out.print(x + "" + map.get(x) + " ");
    }
  }

}
