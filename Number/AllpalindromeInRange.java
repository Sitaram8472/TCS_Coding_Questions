// Problem Statement: Given a range of numbers, find all the palindrome numbers in the range.

// Note: A palindromic number is a number that remains the same when its digits are reversed. OR & a palindrome is a number that reads the same forward and backward Eg: 121,1221, 2552

// Examples

// Example 1: 
// Input: min = 10 , max = 50 
// Output: 11 22 33 44  
// Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward. 

// Example 2: 
// Input: min = 100 , max = 150 
// Output: 101 111 121 131 141  
// Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward. 

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;


public class AllpalindromeInRange {

  public static boolean palindrome(int n) {
    int copy = n;
    int rev = 0;
    while (copy > 0) {
      int rem = copy % 10;
      rev = (rev * 10) + rem;
      copy /= 10;
    }
    return rev == n;

  }

  public static void main(String[] args) {
    int min = 100;
    int max = 150;

    for (int i = min; i <= max; i++) {
      if (palindrome(i)) {
        System.out.print(i + ", ");
      }
    }

  }

}
