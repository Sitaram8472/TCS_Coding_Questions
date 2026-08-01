// Problem Statement: Write a program to count the number of words in a given string.

// Examples
// Input : s = "Hello"
// Output : 1
// Explanation : There is only one word in the entire string.
// Input : s = "Hi there"
// Output : 2
// Explanation : There are 2 words in the entire string.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Countthenumberofwords {
  public static void main(String[] args) {
    String s = "Hi there";

    String[] str = s.split(" ");
    System.out.println(str.length);
  }

}
