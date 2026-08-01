// Change every letter with next lexicographic alphabet

// 0

// Problem Statement: Given a string, write a program to change every letter in the given string with the letter following it in the alphabet (ie. a becomes b, p becomes q, z becomes a) .

// Examples
// Example 1:

// Input: string str = “abcdxyz”
// Output: bcdeyza

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class nextlexicographic {
  public static void main(String[] args) {
    String s = "abcdxyz";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'z') {
        System.out.print('a');
        continue;
      }
      System.out.print((char) (s.charAt(i) + 1));
    }

  }

}
