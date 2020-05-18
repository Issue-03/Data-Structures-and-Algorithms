// Given an array of positive integers. The task is to find inversion count of array.
//
// Inversion Count : For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
// Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
// Input:
// 1
// 5
// 2 4 1 3 5
//
// Output:
// 3

#include <bits/stdc++.h>
using namespace std;
long int _mergeSort(int arr[], int temp[], int left, int right);
long int merge(int arr[], int temp[], int left, int mid, int right);

long int mergeSort(int arr[], int array_size)
{
  int temp[array_size];
  return _mergeSort(arr, temp, 0, array_size - 1);
}

/* An auxiliary recursive function that sorts the input array and
returns the number of inversions in the array. */
long int _mergeSort(int arr[], int temp[], int left, int right)
{
  int mid;
  long int inv_count = 0;
  if (right > left) {
    /* Divide the array into two parts and
    call _mergeSortAndCountInv()
    for each of the parts */
    mid = (right + left) / 2;

    /* Inversion count will be sum of
    inversions in left-part, right-part
    and number of inversions in merging */
    inv_count += _mergeSort(arr, temp, left, mid);
    inv_count += _mergeSort(arr, temp, mid + 1, right);

    /*Merge the two parts*/
    inv_count += merge(arr, temp, left, mid + 1, right);
  }
  return inv_count;
}

/* This funt merges two sorted arrays
and returns inversion count in the arrays.*/
long int merge(int arr[], int temp[], int left,
  int mid, int right)
  {
    int i, j, k;
    long int inv_count = 0;

    i = left; /* i is index for left subarray*/
    j = mid; /* j is index for right subarray*/
    k = left; /* k is index for resultant merged subarray*/
    while ((i <= mid - 1) && (j <= right)) {
      if (arr[i] <= arr[j]) {
        temp[k++] = arr[i++];
      }
      else {
        temp[k++] = arr[j++];

        /* this is tricky -- see above
        explanation/diagram for merge()*/
        inv_count = inv_count + (mid - i);
      }
    }

    /* Copy the remaining elements of left subarray
    (if there are any) to temp*/
    while (i <= mid - 1)
    temp[k++] = arr[i++];

    /* Copy the remaining elements of right subarray
    (if there are any) to temp*/
    while (j <= right)
    temp[k++] = arr[j++];

    /*Copy back the merged elements to original array*/
    for (i = left; i <= right; i++)
    arr[i] = temp[i];

    return inv_count;
  }

  int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int T;
    cin>>T;
    while(T--) {
      int n;
      cin>>n;
      int a[n];
      for(int i=0;i<n;i++)
      cin>>a[i];

      cout<<mergeSort(a,n)<<endl;

    }
    return 0;
  }
