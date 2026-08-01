// Problem Statement:  Write a program to sort characters (numbers and punctuation symbols are not included) in a given string.

// Examples:

// Example 1:
// Input: String str = “zxcbg”
// Output: bcgxz
// Explanation: After sorting we get string as bcgxz

// Example 2:
// Input: String str = “edcba”
// Output: abcde
// Explanation: After sorting we get string as abcde

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class sortcharactersinastring {
  public static void main(String[] args) {
    String str = "edcba";

    char[] ch = str.toCharArray();

    Arrays.sort(ch);
    System.out.println(new String(ch));
  }

}
