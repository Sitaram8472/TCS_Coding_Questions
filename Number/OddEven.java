
// Problem Statement: Given a number n, check whether a given number is even or odd.

// Examples

// Input: n=5
// Output: odd
// Explanation: 5 is not divisible by 2.

// Input: n=6
// Output: even
// Explanation: 6 is divisible by 2.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class OddEven {
  public static void main(String[] args) {
    int n = 82154792;
    if ((n & 1) == 0) {
      System.out.println("EVEN");
    } else {
      System.out.println("ODD");
    }
  }
}
