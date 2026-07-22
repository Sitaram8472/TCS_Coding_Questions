// Problem Statement: Check if the given year is a leap year or not.

// Examples
// Example 1:
// Input: 1996
// Output: Yes
// Explanation: Since 1996 is a leap year answer is “Yes”.

// Example 2:
// Input: 2000
// Output: Yes
// Explanation: Since 2000 is a leap year answer is “Yes”.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class leapyearornot {
  public static void main(String[] args) {
    int year = 2026;

    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
      System.out.println("yes This is leap year");
    } else {
      System.out.println("No This is not leap year");
    }
  }

}
