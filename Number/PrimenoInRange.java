// Problem Statement: Given two integers a and b, find prime numbers in a given range [a,b], (a and b are included here).

// Examples
// Input: a = 2, b = 10
// Output: [2, 3, 5, 7]  
// Explanation: Prime Numbers between 2 and 10 are 2,3,5 and 7.
// Input: a = 10, b = 16
// Output: [11, 13] 
// Explanation: Prime Numbers between 10 and 16 are 11 and 13.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class PrimenoInRange {

  static boolean[] prime = new boolean[100001];

  static {
    prime[0] = true;
    prime[1] = true;
    for (int i = 2; i * i <= 100000; i++) {
      if (!prime[i]) {
        for (int j = i * i; j <= 100000; j += i) {
          prime[j] = true;
        }
      }
    }
  }

  public static void main(String[] args) {
    int a = 10;
    int b = 30000;

    for (int i = a; i <= b; i++) {
      if (!prime[i]) {
        System.out.print(i + " ");
      }
    }

  }
}
