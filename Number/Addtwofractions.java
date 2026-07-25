// Problem Statement: Given numerator and denominator of two fractional numbers, return the sum of two fractional numbers.

// Examples
// Input: Numerator1 = 3, Denominator1 = 4, Numerator2 = 1, Denominator2 = 7
// Output: Numerator = 25, Denominator = 28 
// Explanation: 3/4 + 1/7 = 25/28
// Input: Numerator1 = 5, Denominator1 = 2, Numerator2 = 1, Denominator2 = 2
// Output: Numerator = 3, Denominator = 1
// Explanation: 5/2 + 1/2 = 6/2 = 3

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Addtwofractions {
  public static void main(String[] args) {
    int nume1 = 3;
    int demo1 = 4;

    int nume2 = 1;
    int demo2 = 7;

    int nume = nume1 * demo2 + nume2 * demo1;
    int demo = demo1 * demo2;

    int a = nume;
    int b = demo;

    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }

    int gcd = a;

    nume /= gcd;
    demo /= gcd;
    System.out.println("Numerator = " + nume);
    System.out.println("Denominator = " + demo);

  }

}
