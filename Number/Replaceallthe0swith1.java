// Problem Statement: You are given an integer. Your task is to replace all the zeros in the integer with ones.

// Examples
// Input N = 102003 
// Output 112113 
// Explanation The 2nd, 4th, and 5th positions from the left contain 0. These 0s are replaced with 1s, resulting in 112113.

// Input N = 204 
// Output 214
// Explanation The 2nd position from the left contains 0. That 0 is replaced with 1, giving 214.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Replaceallthe0swith1 {
  public static void main(String[] args) {
    int n = 102003;

    StringBuilder sb = new StringBuilder(String.valueOf(n));
    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) == '0') {
        sb.setCharAt(i, '1');
      }
    }
    System.out.println(sb.toString());

  }

}
