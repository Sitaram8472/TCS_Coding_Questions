// Problem Statement:Given an integer N, return true it is an Armstrong number otherwise return false.

// An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
// Examples
// Example 1:
// Input:N = 153
// Output:True
// Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153

// Example 2:
// Input:N = 371                
// Output: True
// Explanation: 3^3+7^3+1^3 = 27 + 343 + 1 = 371

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Armstrong {

  public static void main(String[] args) {
    int n = 1532;
    int digit = String.valueOf(n).length();
    int sum = 0;
    int copy = n;
    while (copy > 0) {
      int rem = copy % 10;
      sum += Math.pow(rem, digit);
      copy /= 10;
    }

    System.out.println(sum == n ? "YES" : "NO");

  }

}
