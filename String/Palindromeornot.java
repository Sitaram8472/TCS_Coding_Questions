// Problem Statement: Given a string, check if the string is palindrome or not. A string is said to be palindrome if the reverse of the string is the same as the string.

// Examples
// Example 1:
// Input: Str =  “ABCDCBA”
// Output: Palindrome
// Explanation: String when reversed is the same as string.

// Example 2:
// Input: Str = “TAKE U FORWARD”
// Output: Not Palindrome
// Explanation: String when reversed is not the same as string.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

/**
 * Palindromeornot
 */
public class Palindromeornot {

  public static void main(String[] args) {
    String str = "ABCDCOA";

    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");

  }
}