// Problem Statement: Given a number, check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself..

// Examples

// Example 1:
// Input Format: N = 76
// Result: Automorphic Number
// Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.

// Example 2:
// Input Format: 25
// Result: Automorphic Number
// Explanation: Calculating 25 * 25 gives 625, it ends with the given number.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class AutomorphicNumber {

  public static void main(String[] args) {
    long n = 76;

    long multiply = n * n;
    while (n > 0) {
      long nrem = n % 10;
      long multiplyrem = multiply % 10;

      if (nrem != multiplyrem) {
        System.out.println("NOT Automorphic Number");
        return;
      }
      n /= 10;
      multiply /= 10;
    }
    System.out.println("Automorphic Number");
  }

}
