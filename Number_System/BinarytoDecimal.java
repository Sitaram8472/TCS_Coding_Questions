// Problem Statement: Convert a binary number to a decimal number.

// Examples
// Example 1:
// Input: N = 1011
// Output: 11
// Explanation: 1011 when converted to decimal number is “11”.

// Example 2:
// Input: 100
// Output: 4
// Explanation: 100 when converted to decimal number is “4”.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class BinarytoDecimal {

  public static void main(String[] args) {
    int n = 1011;

    int pow = 0;
    int ans = 0;
    while (n > 0) {
      int digit = n % 10;
      ans += digit * Math.pow(2, pow);
      pow++;
      n /= 10;

    }

    System.out.println(ans);

  }
}
