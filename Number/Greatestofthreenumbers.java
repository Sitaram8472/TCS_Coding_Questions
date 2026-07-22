// Problem Statement: Given three numbers. Find the greatest of three numbers.

// Examples
// Example 1:
// Input: 1 3 5
// Output: 5
// Explanation: Answer is 5.Since 5 is greater than 1 and 3.

// Example 2:
// Input: 1.123  1.124 1.125
// Output: 1.125
// Explanation: Answer is 1.125. Since 1.125 is greater than 1.123 and 1.124

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Greatestofthreenumbers {
  public static void main(String[] args) {
    int a = 8;
    int b = 3;
    int c = 6;
    if (a > b && a > c) {
      System.out.println(a);
    } else if (b > a && b > c) {
      System.out.println(b);
    } else {
      System.out.println(c);
    }
  }

}
