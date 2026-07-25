// Problem Statement: Given an integer Print “YES” if it is a strong number else print “NO”.

// Note : 

// When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number. 
// Strong number is also known as Krishnamurthi number/Peterson Number.
// Examples
// Examples 1:
// Input:
//  N = 145
// Output
// : Yes
// Explanation:
//  1! + 4! + 5! = 145. Hence 145 is a strong number. 

// Example 2:
// Input:
//   26
// Output:
//  No
// Explanation:
//  2! + 6! = 722. Hence 26 is not a strong number.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class StrongNumberornot {
  public static void main(String[] args) {

    int n = 26;

    long ans = 0;
    int copy = n;

    while (copy > 0) {
      int rem = copy % 10;
      long sum = 1;
      for (int i = 1; i <= rem; i++) {
        sum = sum * i;
      }
      ans += sum;
      copy /= 10;
    }

    System.out.println(ans == n ? "YES" : "NO");
  }
}
