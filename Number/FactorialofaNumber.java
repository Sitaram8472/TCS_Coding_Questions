// Problem Statement: Given a number X,  print its factorial.

// To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.

// Note: X  is always a positive number. 

// Examples
// Example 1:
// Input:
//  X = 5
// Output:
//  120
// Explanation:
//  5! = 5*4*3*2*1

// Example 2:
// Input:
//  X = 3
// Output:
//  6
// Explanation:
//  3!=3*2*1

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class FactorialofaNumber {
  public static void main(String[] args) {
    int n = 10;
    long ans = 1;
    for (int i = 1; i <= n; i++) {
      ans = ans * i;
    }

    System.out.println(ans);
  }
}
