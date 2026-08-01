// Problem Statement: Given a number, convert it into the form of words.

// Note:- Consider maximum no. of digits in the number as 4.

// Examples
// Example 1:
// Input: 7824
// Output: seven thousand eight hundred twenty four
// Explanation: 7824 in words can be written as seven thousand eight hundred twenty four.

// Example 2:
// Input: 370
// Output: three hundred seventy
// Explanation: 370 in words can be written as three hundred seventy.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class numberstowords {
  static String[] ones = {
      "", "one", "two", "three", "four", "five",
      "six", "seven", "eight", "nine", "ten",
      "eleven", "twelve", "thirteen", "fourteen",
      "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
  };

  static String[] tens = {
      "", "", "twenty", "thirty", "forty",
      "fifty", "sixty", "seventy", "eighty", "ninety"
  };

  public static void main(String[] args) {

    int n = 7824;

    if (n == 0) {
      System.out.println(0);
      return;
    }

    if (n >= 1000) {
      System.out.print(ones[n / 1000] + " thousand ");
      n %= 1000;
    }
    if (n >= 100) {
      System.out.print(ones[n / 100] + " hundred ");
      n %= 100;
    }

    if (n >= 20) {
      System.out.print(tens[n / 10] + " ");
      n %= 10;
    }

    if (n > 0) {
      System.out.print(ones[n]);
    }

  }

}
