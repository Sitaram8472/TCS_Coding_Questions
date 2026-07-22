// Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers .

// Examples
// Input: N=5
// Output: 15
// Explanation: 1+2+3+4+5=15

// Input: N=6
// Output: 21
// Explanation: 1+2+3+4+5+6=15

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class sumOfnaturalNo {
  public static void main(String[] args) {
    int n = 5;
    System.out.println(n * (n + 1) / 2);
  }
}
