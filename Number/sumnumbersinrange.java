// Problem Statement: Find the sum of numbers in the given range.

// Examples
// Example 1:
// Input:
//  l = 2, r = 7  
// Output:
//  27  
// Explanation:
//   The sum of numbers from 2 to 7 is: 2 + 3 + 4 + 5 + 6 + 7 = 27.  
// Therefore, the result is 27.

// Example 2:
// Input:
//  l = 5, r = 9  
// Output:
//  35  
// Explanation:
//   The sum of numbers from 5 to 9 is: 5 + 6 + 7 + 8 + 9 = 35.  
// Therefore, the result is 35.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class sumnumbersinrange {
  public static void main(String[] args) {
    int a = 5;
    int b = 9;

    int ans = b * (b + 1) / 2;
    int ans2 = a * (a - 1) / 2;
    System.out.println(ans - ans2);

  }
}
