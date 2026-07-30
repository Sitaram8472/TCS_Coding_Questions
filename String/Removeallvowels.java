// Problem Statement: Given a String, write a program to remove vowels from the String.

// Examples
// Input: str = “take u forward”
// Output: "tk  frwrd" 
// Explanation: All vowels are removed from the given String.
// Input: str = “I am very happy today” 
// Output: "m vry hppy tdy"
// Explanation: All vowels are removed from the given String.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Removeallvowels {
  public static void main(String[] args) {
    String str = "take u forward";

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      char ch = Character.toLowerCase(str.charAt(i));

      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        continue;
      }
      sb.append(ch);

    }

    System.out.println(sb.toString());

  }

}
