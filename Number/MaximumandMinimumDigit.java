// Problem Statement: Given a number N, print the smallest and largest digits present in the number.

// Examples
// Input: N = 2746
// Output: Largest digit: 7, Smallest digit: 2
// Explanation: 
// Largest digit in N is 7 whereras smallest digit is 2.
// Input: N = 23004
// Output: Largest digit : 4, Smallest digit : 0
// Explanation: 
// Largest digit in N is 4 whereras smallest digit is 0.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class MaximumandMinimumDigit {
  public static void main(String[] args) {
    int n = 123456;

    int max = -1;
    int min = 10000000;

    while (n > 0) {
      int rem = n % 10;
      max = Math.max(max, rem);
      min = Math.min(max, rem);

      n /= 10;
    }

    System.out.println("MAX " + max + " MIN " + min);

  }
}
