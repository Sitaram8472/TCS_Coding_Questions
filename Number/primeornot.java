// Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2..

// Examples

// Example 1:
// Input:N = 2

// Output:True

// Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).

// Example 2:
// Input:N =10                

// Output: False

// Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.                       

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class primeornot {
  public static void main(String[] args) {

    int n = 78;
    if (n == 0 || n == 1) {
      System.out.println(false);
      return;
    }

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        System.out.println(false);
        return;
      }
    }
    System.out.println(true);
  }
}
