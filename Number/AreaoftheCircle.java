// Problem Statement: Given the radius of the circle, calculate the area of the circle. .

// Examples
// Example 1:
// Input: N = 5
// Output: 78.5
// Explanation: Using formula  πr2 for finding area of circle we get area as 78.5

// Example 2:
// Input: N = 4
// Output: 50.2
// Explanation: Using formula  πr2 for finding area of circle we get area as 50.2

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class AreaoftheCircle {
  public static void main(String[] args) {
    float r = 4;
    float area = (22.f / 7) * r * r;
    System.out.println(Math.round(area * 10) / 10.0f);
  }

}
