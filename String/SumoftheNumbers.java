// Problem: Given a string, calculate the sum of numbers in a string (multiple consecutive digits are considered one number)

// Examples

// Input :  string = "123xyz"
// Output :  123
// Explanation :  The only number is 123, so the sum = 123

// Input :  string = "1xyz23"
// Output :  24
// Explanation :  Numbers are 1 and 23, sum = 24

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class SumoftheNumbers {
  public static void main(String[] args) {
    String s = "1xyz23sd2ddd5";

    int sum = 0;
    int num = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isDigit(ch)) {
        num = num * 10 + (ch - '0');
      } else {
        sum += num;
        num = 0;
      }
    }

    sum += num;
    System.out.println(sum);
  }

}
