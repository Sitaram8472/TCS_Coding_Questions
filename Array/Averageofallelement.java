// Average of all the elements in the array

// Average of all the elements in the array .

// Examples
// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5}
// Output: 3
// Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+3+4+5)/5 = 3.

// Example 2:
// Input:  N=6, array[] = {1,2,1,1,5,1}
// Output: 1.8
// Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+1+1+5+1)/6 = 1.8

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Averageofallelement {
  public static void main(String[] args) {
    int array[] = { 1, 2, 1, 1, 5, 1 };
    float sum = 0;
    for (int x : array) {
      sum += x;
    }
    System.out.println(sum / array.length);
  }
}
