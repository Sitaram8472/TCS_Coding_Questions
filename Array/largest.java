// Problem Statement: Given an array, we have to find the largest element in the array.

// Examples
// Example 1:
// Input:
//  arr[] = {2, 5, 1, 3, 0}  
// Output:
//  5  
// Explanation:

// 5 is the largest element in the array.

// Example 2:
// Input:
//  arr[] = {8, 10, 5, 7, 9}  
// Output:
//  10  
// Explanation:

// 10 is the largest element in the array.

public class largest {
  public static void main(String[] args) {
    int arr[] = { 2, 5, 1, 3, 0 };

    int big = 0;
    for (int x : arr) {
      if (big < x) {
        big = x;
      }
    }

    System.out.println(big);

  }
}
