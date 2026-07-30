// Problem Statement: Write a program that reverses a given string (in-place).

// Examples
// Input :  "hello"
// Output :  "olleh"
// Explanation :  Each character of the string is reversed.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class ReverseaString {
  public static void main(String[] args) {
    String s = "I am iron man";

    StringBuilder sb = new StringBuilder(s);
    System.out.println(sb.reverse());
  }
}
