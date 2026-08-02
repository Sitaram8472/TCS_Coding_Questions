// Problem Statement: Write a program to find a word in a given string that has the highest number of repeated letters. If not found, return -1.

// Examples
// Example 1:
// Input:
//  string = "abcdefghij google microsoft"  
// Output:
//  google  
// Explanation:

// In “google”, the letter g appears 2 times, and o appears 2 times — which is the highest frequency of any letter among all words.

// Example 2:
// Input:
//  string = "cameron blue"  
// Output:
//  -1  
// Explanation:

// No word has any letter that repeats. Hence, return -1.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class wordwithhighestnumberofrepeated {
  public static void main(String[] args) {
    String s = "abcdefghij google microsoft";
    String[] arr = s.split(" ");

    String ans = "";
    int max = 1;
    for (String str : arr) {
      HashMap<Character, Integer> map = new HashMap<>();

      int currmax = 0;
      for (char ch : str.toCharArray()) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);

        currmax = Math.max(currmax, map.get(ch));
      }

      if (currmax > max) {
        max = currmax;
        ans = str;
      }
    }
    System.out.println(max == 1 ? -1 : ans);
  }

}
