// Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

// Examples
// Example 1:
// Input: N = 5
// Output: 0 1 1 2 3 5
// Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

// Example 2:
// Input: 6
// Output: 0 1 1 2 3 5 8
// Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class FibonacciSeries {
  public static void main(String[] args) {
    int n = 5;

    if (n == 0) {
      System.out.println(0);
    } else if (n == 1) {
      System.out.println(0 + " " + 1);
    } else {
      int a = 0;
      int b = 1;
      System.out.print(a + " " + b + " ");
      for (int i = 2; i <= n; i++) {
        int c = a + b;
        System.out.print(c + " ");
        a = b;
        b = c;
      }

    }

  }

}
