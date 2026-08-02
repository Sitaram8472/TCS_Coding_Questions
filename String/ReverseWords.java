// Problem Statement: Given an input string, containing upper-case and lower-case letters, digits, and spaces( ' ' ). A word is defined as a sequence of non-space characters. The words in s are separated by at least one space. Return a string with the words in reverse order, concatenated by a single space.

// Examples
// Input: s = "welcome to the jungle"
// Output: "jungle the to welcome"
// Explanation: The words in the input string are "welcome", "to", "the", and "jungle". Reversing the order of these words gives "jungle", "the", "to", and "welcome". The output string should have exactly one space between each word.

// Input: s = " amazing coding skills "
// Output: "skills coding amazing"
// Explanation: The input string has leading and trailing spaces, as well as multiple spaces between the words "amazing", "coding", and "skills". After trimming the leading and trailing spaces and reducing the multiple spaces between words to a single space, the words are "amazing", "coding", and "skills". Reversing the order of these words gives "skills", "coding", and "amazing". The output string should not have any leading or trailing spaces and should have exactly one space between each word.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class ReverseWords {
  public static void main(String[] args) {
    String s = "welcome to the jungle";

    String[] str = s.split(" ");
    StringBuilder sb = new StringBuilder();

    for (int i = str.length - 1; i >= 0; i--) {
      sb.append(str[i] + " ");
    }

    System.out.println(sb.toString());

  }

}
