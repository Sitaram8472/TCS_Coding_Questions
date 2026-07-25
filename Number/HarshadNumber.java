// Problem Statement: Check if the number is a Harshad(or Niven) number or not.

// Examples
// Example 1:
// Input: 378
// Output: Yes it is a Harshad number.
// Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

// Example 2:
// Input: 379
// Output: No
//  it is not a Harshad number.
// Explanation: 3+7+9=19. 379 is not divisible by 19. Therefore 379 is a harshad number.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class HarshadNumber {
  public static void main(String[] args) {
    int n = 379;

    int copy = n;
    int sum = 0;
    while (copy > 0) {
      sum += copy % 10;
      copy /= 10;
    }
    if (n % sum == 0) {
      System.out.println("Harsad number");
    } else {
      System.out.println("NO Harsed number");
    }
  }
}
