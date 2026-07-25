// Problem Statement: Find permutations in which n people can occupy r seats in a classroom.

// Examples
// Input: N = 5, r = 3
// Output: 60
// Explanation: To find permutations of n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! is 60.
// Input: N=6, r = 4.
// Output: 360 
// Explanation: The value of 6!/(6-4)! is 360.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class PermutationsNpeopleRseats {
  public static void main(String[] args) {
    int n = 6;
    int r = 4;

    int permu = 1;
    for (int i = 1; i <= n; i++) {
      permu = permu * i;
    }
    int val = n - r;
    int occupy = 1;
    for (int i = 1; i <= val; i++) {
      occupy = occupy * i;
    }
    System.out.println(permu / occupy);
  }
}
