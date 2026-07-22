// Problem Statement: Find all factors of a number or find all distinct divisors of a natural number.

// Examples
// Input: n = 6
// Output: [1, 2, 3, 6]  
// Explanation: 6 is divisible by 1,2,3,6.
// Input: n = 9
// Output: [1, 3, 9] 
// Explanation: 9 is divisible by 1,3,9.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class FactorsofaGivenNumber {
  public static void main(String[] args) {
    int n = 6;

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        list.add(i);
        if (i != n / i) {
          list.add(n / i);
        }
      }
    }

    Collections.sort(list);

    System.out.println(list);
  }
}
