// Problem Statement: The standard form of a quadratic equation is: ax^2 + bx + c = 0, where a, b and c are real numbers and a != 0. Given a, b and c of the equation, find the roots of the equation.

// Examples
// Input: a = 1, b = -3, c = -10
// Output: Roots are real and different, i.e (5 , -2). 
// Explanation: 5 and -2 satisfy the equation x^2 - 3x - 10 = 0
// Input: a = 1, b = 1, c = 1
// Output: Roots are complex, i.e-(-0.5+i1.732 , -0.5-i1.732).
// Explanation: Roots of equation x^2 + x + 1 = 0 are imaginary.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Rootsofaquadraticequation {
  public static void main(String[] args) {
    double a = 1;
    double b = -3;
    double c = -10;

    double d = b * b - 4 * a * c;

    if (d > 0) {
      double root1 = (-b + Math.sqrt(d)) / (2 * a);
      double root2 = (-b - Math.sqrt(d)) / (2 * a);

      System.out.println(root1 + " " + root2);
    } else if (d == 0) {
      double root = -b / (2 * a);
      System.out.println(root);
    } else {
      double real = -b / (2 * a);
      double img = Math.sqrt(-d) / (2 * a);

      System.out.println(real + " " + img);
    }
  }
}
