// Problem Statement: Given a geometric Progression (G.P) sequence with some inputs as
// 1. a, first term
// 2. r, common ratio
// 3. n, number of terms
// Write a program to find the sum of the Geometric Progression Series.

// Examples
// Input: a=1 , r=0.5 , n=3
// Output: 1.75 
// Explanation: The elements of GP are 1, 0.5 and 0.25
// Input: a=3 , r=5 , n=2
// Output: 18.
// Explanation: The elements of GP are 3 and 15

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class SumofGPSeries {
  public static void main(String[] args) {
    int a = 3, r = 5, n = 2;
    if (r == 1) {
      System.out.println(a * n);
    }

    double ans = a * (Math.pow(r, n) - 1) / (r - 1);
    System.out.println(ans);

  }

}
