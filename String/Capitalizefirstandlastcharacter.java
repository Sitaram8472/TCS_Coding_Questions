// Problem Description: Given a string, write a program to capitalize the first and last character of each word of that string.

// Examples
// Input: str = "take u forward is awesome"
// Output: “TakE U ForwarD IS AwesomE”
// Explanation: We get the result after capitalizing the first and last character of each word of a string.
// Input: str = "I am a boy"
// Output: "I AM A BoY" 
// Explanation: First and last letter of each word is capitalized.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Capitalizefirstandlastcharacter {
  public static void main(String[] args) {
    String str = "I am a boy";

    char[] ch = str.toCharArray();
    for (int i = 0; i < ch.length; i++) {
      if (i == 0 || ch[i - 1] == ' ') {
        ch[i] = Character.toUpperCase(ch[i]);
      }
      if (i == ch.length - 1 || ch[i + 1] == ' ') {
        ch[i] = Character.toUpperCase(ch[i]);
      }

    }
    System.out.println(new String(ch));

  }
}
