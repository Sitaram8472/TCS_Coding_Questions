// Problem Statement: Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific position.

// Examples
// Input: N = 5, array[] = {1,2,3,4,5}
// insertbeginning(6)
// insertending(7)
// insertatpos(8,4)

// Output: 6,1,2,8,3,4,5,7

// Explanation: 6 is added at the beginning and 7 is added at the end and 8 is added at position 4.

// Input: N = 5, array[] = {1,2,3,4,5}
// insertbeginning(2)
// insertending(4)
// insertatpos(8,4)

// Output: 2,1,2,8,3,4,5,4

// Explanation: 2 is added at the beginning and 4 is added at the end and 8 is added at position 4.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

/**
 * Addinginarray
 */
public class Addinginarray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    // insertbeginning(6)
    // insertending(7)
    // insertatpos(8,4)

    ArrayList<Integer> list = new ArrayList<>();
    for (int x : arr) {
      list.add(x);
    }

    // before add
    System.out.println(list);
    // after add elment
    list.addFirst(6);
    list.addLast(7);
    list.add(4, 8);
    System.out.println(list);
  }
}