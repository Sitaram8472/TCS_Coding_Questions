// Problem Statement: Given two numbers. Find the greatest of two numbers.

// Examples
// Example 1:
// Input: 1 3
// Output: 3
// Explanation: Answer is 3,since 3 is greater than 1.

// Input: 1.123  1.124
// Output: 1.124
// Explanation: Answer is 1.124,since 1.124 is greater than 1.123.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Greatestoftwonumbers {
  public static void main(String[] args) {
    double a = 1.123;
    double b = 1.124;

    if (a > b) {
      System.out.println(a);
    } else {
      System.out.println(b);
    }

  }
}
