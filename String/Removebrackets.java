// Problem Statement: Given an algebraic expression, write a program to remove brackets from the algebraic expression.

// Examples
// Input: “a+((b-c)+d)”
// Output: “a+b-c+d”
// Explanation: Removed all the brackets from the algebric expression.
// Input: “(((a-b))+c)” 
// Output: “a-b+c”
// Explanation: Removed all the brackets from the algebric expression.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Removebrackets {
  public static void main(String[] args) {
    String s = "a+((b-c)+d)";

    StringBuilder sb = new StringBuilder();

    for (char ch : s.toCharArray()) {
      if (ch != ')' && ch != '(') {
        sb.append(ch);
      }
    }

    System.out.println(sb.toString());

  }

}
