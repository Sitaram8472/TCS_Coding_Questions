// Problem Statement: Given an integer N, print all of its prime factors.

// Examples
// Input: N = 60
// Output: 2, 3, 5  
// Explanation: All factors/divisors of 60 include: 1, 2, 3, 4, 5, 6, 10, 12, 18, 20, 30, 60. Out of these only 2, 3 and 5 are prime.
// Input: N = 35
// Output: 5, 7
// Explanation: All factors/divisors of 35 include: 1, 5, 7, 35. Out of these, only 5 and 7 are prime.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class PrintallPrimeFactors {
  public static void main(String[] args) {
    int n = 60;

    ArrayList<Integer> factor = new ArrayList<>();
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        factor.add(i);
        if (n / i != i) {
          factor.add(n / i);
        }
      }
    }

    ArrayList<Integer> prime = new ArrayList<>();

    for (int x : factor) {
      if (x == 1) {
        continue;
      }
      boolean found = true;

      for (int i = 2; i * i <= x; i++) {
        if (x % i == 0) {
          found = false;
          break;
        }
      }
      if (found) {
        prime.add(x);
      }
    }

    Collections.sort(prime);
    System.out.println(factor);
    System.out.println(prime);
  }
}
