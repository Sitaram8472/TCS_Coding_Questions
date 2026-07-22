// Problem Statement: Given an A.P. Series, we need to find the sum of the Series.

// Examples
// Example 1:
// Input:
//   n = 4, a = 2, d = 2  
// Output:
//  20  
// Explanation:
//   The series is 2, 4, 6, 8.  
// The sum of the series is 2 + 4 + 6 + 8 = 20.

// Example 2:
// Input:
//   n = 8, a = 2, d = 5  
// Output:
//  156
// Explanation:
//  The series is 2, 7, 12, 17, 22, 27, 32, 37.  
// The sum of the series is 2 + 7 + 12 + 17 + 22 + 27 + 32 + 37 = 124.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class SumofAPSeries {
  public static void main(String[] args) {

    int n = 8;
    int a = 2;
    int d = 5;

    // Formula for sum of AP series: (n / 2) * (2a + (n-1) * d)

    float  ans = (n / 2.0f) * (2.0f * a + (n - 1) * d);
    System.out.println(ans);
  }
}
