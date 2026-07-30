// Problem Statement: Given an array of size n, sort the array using Merge Sort.

// Examples
// Input : N=7,arr[]={3,2,8,5,1,4,23}
// Output : {1,2,3,4,5,8,23}
// Explanation : Given array is sorted in non-decreasing order.
// Input : N=5, arr[]={4,2,1,6,7}
// Output : {1,2,4,6,7}
// Explanation : Given array is sorted in non-decreasing order.

import java.util.Arrays;

public class MergeSort {
  static void mergeSort(int[] arr, int low, int high) {

    if (low >= high) {
      return;
    }

    int mid = (low + high) / 2;

    mergeSort(arr, low, mid);

    mergeSort(arr, mid + 1, high);

    merge(arr, low, mid, high);
  }

  static void merge(int[] arr, int low, int mid, int high) {

    int[] temp = new int[high - low + 1];

    int left = low;
    int right = mid + 1;
    int k = 0;

    while (left <= mid && right <= high) {

      if (arr[left] <= arr[right]) {
        temp[k++] = arr[left++];
      } else {
        temp[k++] = arr[right++];
      }
    }

    while (left <= mid) {
      temp[k++] = arr[left++];
    }

    while (right <= high) {
      temp[k++] = arr[right++];
    }

    for (int i = 0; i < temp.length; i++) {
      arr[low + i] = temp[i];
    }
  }

  public static void main(String[] args) {

    int[] arr = { 13, 46, 24, 52, 20, 9 };

    mergeSort(arr, 0, arr.length - 1);

    System.out.println(Arrays.toString(arr));
  }

}
