// Problem Statement: Write a program to remove all characters from a string except alphabets in a given string.

// Examples
// Input: str = "take12% *&u ^$#forward”
// Output: “takeuforward”
// Explanation: All characters except alphabets are removed.
// Input: str1 = “Java&C++" 
// Output: “JavaC”
// Explanation: All characters except alphabets are removed.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Removecharacters {
  public static void main(String[] args) {
    String str = "Java&C++";

    StringBuilder sb = new StringBuilder();

    for (char ch : str.toCharArray()) {
      if (ch <= 'z' && ch >= 'a' || ch <= 'Z' && ch >= 'A') {
        sb.append(ch);
      }
    }
    System.out.println(sb.toString());
  }
}
