// Given an array of integers, find the length of the longest (strictly) increasing subsequence from the given array.
// Example:
// Input:
// 2
// 16
// 0 8 4 12 2 10 6 14 1 9 5 13 3 11 7 15
// 6
// 5 8 3 7 9 1
// Output:
// 6
// 3

// O(n2)
class Solution {

  static int longestSubsequence(int n, int a[]) {
    int[] lis = new int[n];

    int longest = -1;
    for (int i = 0; i < n; i++) lis[i] = 1;

    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (a[i] > a[j] && lis[i] < lis[j] + 1) lis[i] = lis[j] + 1;
      }
    }
    for (int i = 0; i < n; i++) if (longest < lis[i]) longest = lis[i];

    return longest;
  }
}

// in O(n Log n) time
class LIS {

  // Binary search (note boundaries in the caller)
  // A[] is ceilIndex in the caller
  static int CeilIndex(int A[], int l, int r, int key) {
    while (r - l > 1) {
      int m = l + (r - l) / 2;
      if (A[m] >= key) r = m; else l = m;
    }

    return r;
  }

  static int LongestIncreasingSubsequenceLength(int A[], int size) {
    // Add boundary case, when array size is one

    int[] tailTable = new int[size];
    int len; // always points empty slot

    tailTable[0] = A[0];
    len = 1;
    for (int i = 1; i < size; i++) {
      if (A[i] < tailTable[0]) tailTable[0] = A[i]; else if ( // new smallest value
        A[i] > tailTable[len - 1]
      ) tailTable[len++] = // A[i] wants to extend largest subsequence
        A[i]; else tailTable[CeilIndex(tailTable, -1, len - 1, A[i])] = A[i];
      // A[i] wants to be current end candidate of an existing subsequence. It will replace ceil value in tailTable
    }

    return len;
  }

  // Driver program to test above function
  public static void main(String[] args) {
    int A[] = { 2, 5, 3, 7, 11, 8, 10, 13, 6 };
    int n = A.length;
    System.out.println(
      "Length of Longest Increasing Subsequence is " +
      LongestIncreasingSubsequenceLength(A, n)
    );
  }
}
