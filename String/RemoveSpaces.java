// Problem Statement: Given a string, write a program to remove all the whitespaces from the string.

// Examples
// Input:  str = “take U forward”
// Output: "takeUforward"
// Explanation: All the whitespaces are removed.
// Input: str = “How are you doing”
// Output: "Howareyoudoing"
// Explanation: All the whitespaces are removed.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class RemoveSpaces {
  public static void main(String[] args) {
    String str = "How are you doing";

    StringBuilder sb = new StringBuilder();
    for (char ch : str.toCharArray()) {
      if (ch != ' ') {
        sb.append(ch);
      }
    }
    System.out.println(sb.toString());
  }
}
