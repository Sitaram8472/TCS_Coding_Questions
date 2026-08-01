// Problem Statement: Convert a binary number to an octal number.

// Examples
// Example 1:.
// Input: N = 1100110
// Output: 146
// Explanation: 1100110 when converted to octal number is “146”.

// Example 2:
// Input: 11111
// Output: 37
// Explanation: 11111 when converted to octal number is “37”.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class BinarytoOctal {
  public static void main(String[] args) {

    int n = 11111;

    String s = String.valueOf(n);

    while (s.length() % 3 != 0) {
      s = "0" + s;
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < s.length(); i += 3) {
      String group = s.substring(i, i + 3);

      int val = (group.charAt(0) - '0') * 4 + (group.charAt(1) - '0') * 2 + group.charAt(2) - '0';

      sb.append(val);
    }

    System.out.println(sb.toString());

  }

}
