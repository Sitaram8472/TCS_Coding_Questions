// Problem Statement: Given a number n check whether it's positive or negative.

// Examples
// Example 1:
// Input: n=5
// Output: Positive

// Example2:
// Input: n=-6
// Output: Negative

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class NegPos {
  public static void main(String[] args) {
    int n = -15;

    if (n > 0) {
      System.out.println("POSITIVE");
    } else if (n < 0) {
      System.out.println("NEGATIVE");
    } else {
      System.out.println("ZERO");
    }
  }
}
