// Problem Statement: Find the LCM of two numbers.

// Examples
// Example 1:
// Input:
//  num1 = 4,num2 = 8
// Output:
//  8

// Example 2:
// Input:
//  num1 = 3,num2 = 6
// Output:
//  6

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class LCMoftwonumbers {
  public static void main(String[] args) {
    int a = 4;
    int b = 8;

    int lcm = 4 * 8;

    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }

    int gcd = a;

    System.out.println(lcm / gcd);

  }

}
