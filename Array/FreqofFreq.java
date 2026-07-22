// Problem Statement: Given an array of integers, having some duplicate elements, sort the array by frequency .

// Examples

// Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
// Output: 2 2 2 1 1 3 3 4 
// Explanation: Since  2 is present 3 times in an array , so print it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it will be printed at last.

// Input: N = 6, array[] = {-199,6,7,-199,3,5}
// Output: -199 -199 3 5 6 7
// Explanation: Since -199 is present 2 times so it will be printed at first , then 3 , 5 ,6 ,7 are present once in array , so print them in their sorted order.

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class FreqofFreq {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 2, 4, 3, 1, 2 };

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int x : arr) {
      map.put(x, map.getOrDefault(x, 0) + 1);
    }
    ArrayList<Integer> list = new ArrayList<>();

    for (int x : arr) {
      list.add(x);
    }

    Collections.sort(list, (a, b) -> {
      if (!map.get(a).equals(map.get(b))) {
        return Integer.compare(map.get(b), map.get(a));
      }
      return Integer.compare(a, b);
    });

    for (int i = 0; i < list.size(); i++) {
      arr[i] = list.get(i);
    }

    System.out.println(Arrays.toString(arr));
  }
}
