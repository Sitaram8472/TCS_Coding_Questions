// Problem Statement: Given a string, write a program to count the number of vowels, consonants, and spaces in that string.

// Examples
// Example 1:
// Input: string str=”Take u forward is Awesome”
// Output: 
// Vowels: 10
// Consonants: 11
// White spaces: 4

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Countnumberofvowels {
  public static void main(String[] args) {
    String str = "Take u forward is Awesome";
    str = str.toLowerCase();
    int vowel = 0, consoanant = 0, space = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowel++;
      } else if (ch >= 'a' && ch <= 'z') {
        consoanant++;
      } else {
        space++;
      }
    }

    System.out.println(vowel + " " + consoanant + " " + space);
  }
}
