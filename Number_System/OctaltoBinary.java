// Problem Statement: Given an Octal Number, convert it into Binary Number.

// Examples
// Example 1:
// Input: 345
// Output: 011100101
// Explanation: Binary equivalent of given Octal expressionis 011100101

// Example 2:
// Input: 170
// Output: 001111000
// Explanation: Binary equivalent of given Octal expression is 001111000

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class OctaltoBinary {
  public static void main(String[] args) {
    int n = 170;
    String s = String.valueOf(n);

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)) {
        case '0':
          sb.append("000");
          break;
        case '1':
          sb.append("001");
          break;

        case '2':
          sb.append("010");
          break;
        case '3':
          sb.append("011");
          break;

        case '4':
          sb.append("100");
          break;
        case '5':
          sb.append("101");
          break;
        case '6':
          sb.append("110");
          break;
        case '7':
          sb.append("111");
          break;

        default:
          break;
      }
    }

    while (s.length() > 1 && s.charAt(0) == '0') {
      sb.deleteCharAt(0);
    }

    System.out.println(sb.toString());
  }
}
