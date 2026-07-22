// Problem Statement: Given an integer N return the reverse of the given number.

// Note: If a number has trailing zeros, then its reverse will not include them. For e.g , reverse of 10400 will be 401 instead of 00401.

// Examples
// Input: N = 12345
// Output:54321
// Explanation: The reverse of 12345 is 54321.

// Input: N = 7789                
// Output: 9877
// Explanation: The reverse of number 7789 is 9877.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Reversedigits {
  public static void main(String[] args) {

    int n = 123456;

    int ans = 0;
    while (n > 0) {
      int rem = n % 10;
      ans = (ans * 10) + rem;
      n /= 10;
    }
    System.out.println(ans);
  }

}
