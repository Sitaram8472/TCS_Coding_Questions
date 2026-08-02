// Problem Statement: Write a program to change the case (lower to upper and upper to lower cases) of each character of a given string.

// Examples
// Example 1:
// Input: String str = “javA”
// Output: JAVa
// Explanation:
// Changed the lower case characters to uppercase and vice versa.

// Example 2:
// Input: String str = “take u forward IS Awesome”
// Output: TAKE U FORWARD is aWESOME
// Explanation: Changed the lower case characters to uppercase and vice versa.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Changecaseofeachcharacter {
  public static void main(String[] args) {
    String str = "javA";

    StringBuilder sb = new StringBuilder();

    for (char ch : str.toCharArray()) {
      if (Character.isLowerCase(ch)) {
        sb.append(Character.toUpperCase(ch));
      } else {
        sb.append(Character.toLowerCase(ch));
      }
    }

    System.out.println(sb.toString());

  }

}
