// Problem Statement: Convert decimal to binary number.

// Examples
// Example 1:
// Input: N = 15
// Output: 1111
// Explanation: 15 in binary is represented as "1111".

// Example 2:
// Input: 18
// Output: 10010
// Explanation: 18 in binary is represented as "10010".

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class DecimaltoBinaryNumber {
  public static void main(String[] args) {
    int n = 18;
    StringBuilder sb = new StringBuilder();

    while (n != 0) {
      sb.append(n % 2);
      n /= 2;
    }
    sb.reverse();

    System.out.println(sb.toString());

  }

}
