// Problem Statement: Given an array of n integers, sort the array using the Quicksort method.

// Examples
// Input: N = 5, Arr[] = {4,1,7,9,3}
// Output: {1, 3, 4, 7, 9}
// Explanation: After sorting the array in ascending order it becomes 1, 3, 4, 7, 9
// Input: N = 8, Arr[] = {4,6,2,5,7,9,1,3}
// Output: {1, 2, 3, 4, 5, 6, 7, 9}
// Explanation: After sorting the array in ascending order it becomes 1, 2, 3, 4, 5, 6, 7, 9

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class QuickSort {
  static void quickSort(int[] arr, int low, int high) {

    if (low < high) {

      int pivotIndex = partition(arr, low, high);

      quickSort(arr, low, pivotIndex - 1);

      quickSort(arr, pivotIndex + 1, high);
    }
  }

  static int partition(int[] arr, int low, int high) {

    int pivot = arr[low];

    int i = low;
    int j = high;

    while (i < j) {

      while (i <= high - 1 && arr[i] <= pivot) {
        i++;
      }

      while (j >= low + 1 && arr[j] > pivot) {
        j--;
      }

      if (i < j) {
        swap(arr, i, j);
      }
    }

    swap(arr, low, j);

    return j;
  }

  static void swap(int[] arr, int i, int j) {

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {

    int[] arr = { 13, 46, 24, 52, 20, 9 };

    quickSort(arr, 0, arr.length - 1);

    System.out.println(Arrays.toString(arr));
  }

}
