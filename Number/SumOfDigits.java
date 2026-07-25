// Problem Statement: Given an integer num, repeatedly add all its digits until the result has only one digit, and return i .

// Examples
// Input: num = 529
// Output:7
// Explanation: In first iteration the digits sum will be = 5 + 2 + 9 => 16
// In second iteration the digits sum will be 1 + 6 => 7.
// Now single digit is remaining , so we return it. 

// Input:num = 101
// Output: 2
// Explanation: In first iteration the digits sum will be = 1 + 0 + 1 => 2
// Now single digit is remaining , so we return it. 

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class SumOfDigits {

  public static void main(String[] args) {
    int n = 101;

    int copy = n;

    while (n > 9) {
      int sum = 0;
      while (copy > 0) {
        sum += copy % 10;
        copy /= 10;
      }
      n = sum;
      copy = sum;
    }
    System.out.println(copy);

  }
}
