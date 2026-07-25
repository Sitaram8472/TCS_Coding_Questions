// Problem Statement: Given a number n, express the number as a sum of 2 prime numbers.

// Examples
// Example 1:

// Input : N = 74
// Output : True . 
// Explanation:
//  74 can be expressed as 71 + 3 and both are prime numbers. 

// Example 2:

// Input : N = 11
// Output : False. 
// Explanation: 
// 11 cannot be expressed as sum of two prime numbers.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class TwoPrimeNumbers {
  private static boolean prime(int n) {
    if (n < 2) {
      return false;
    }

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int n = 11;

    for (int i = 2; i <= n / 2; i++) {
      if (prime(i) && prime(n - 1)) {
        System.out.println("YES");
        return;
      }
    }

    System.out.println("NO");

  }
}
