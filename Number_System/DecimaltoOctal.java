// Problem Statement: Given a decimal number, convert it into Octal Number .

// Examples
// Input:  17
// Output: 21
// Explanation: Octal Equivalent of 17 is 21

// Input:  45
// Output: 55
// Explanation: Octal Equivalent of 45 is 55

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class DecimaltoOctal {
  public static void main(String[] args) {
    int n = 55;

    StringBuilder sb = new StringBuilder();

    while (n != 0) {
      sb.append(n % 8);
      n /= 8;
    }

    System.out.println(sb.reverse());

  }

}
