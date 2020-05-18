// Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).
//
// Note: Expected time complexity is O((n+m) log(n+m)). DO NOT use extra space.  We need to modify existing arrays as following.
//
// Input: arr1[] = {10};
//        arr2[] = {2, 3};
// Output: arr1[] = {2}
//         arr2[] = {3, 10}
//
// Input: arr1[] = {1, 5, 9, 10, 15, 20};
//        arr2[] = {2, 3, 8, 13};
// Output: arr1[] = {1, 2, 3, 5, 8, 9}
//         arr2[] = {10, 13, 15, 20}

// Without Extra Space
#include <bits/stdc++.h>
using namespace std;

int nextGap(int gap)
{
    if (gap <= 1)
        return 0;
    return (gap / 2) + (gap % 2);
}

void merge(int *arr1, int *arr2, int n, int m)
{
    int i, j, gap = n + m;
    for (gap = nextGap(gap); gap > 0; gap = nextGap(gap))
    {
        // comparing elements in the first array.
        for (i = 0; i + gap < n; i++)
            if (arr1[i] > arr1[i + gap])
                swap(arr1[i], arr1[i + gap]);

        //comparing elements in both arrays.
        for (j = gap > n ? gap-n : 0 ; i < n&&j < m; i++, j++)
            if (arr1[i] > arr2[j])
                swap(arr1[i], arr2[j]);

        if (j < m)
        {
            //comparing elements in the second array.
            for (j = 0; j + gap < m; j++)
                if (arr2[j] > arr2[j + gap])
                    swap(arr2[j], arr2[j + gap]);
        }
    }
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int T;
  cin>>T;
  while(T--) {
    int n,m;
    cin>>n>>m;
    int sortedA[n],sortedB[m];
    for(int i=0;i<n;i++)
    cin>>sortedA[i];
    for(int i=0;i<m;i++)
    cin>>sortedB[i];

    merge(sortedA, sortedB, n, m);
  }
  return 0;
}



// With Extra Space
/*#include <iostream>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int T;
  cin>>T;
  while(T--) {
    int n,m;
    cin>>n>>m;
    int sortedA[n],sortedB[m];
    for(int i=0;i<n;i++)
    cin>>sortedA[i];
    for(int i=0;i<m;i++)
    cin>>sortedB[i];

    int merged_array[n+m],i=0,j=0,k=0;

    for(int i=0; i<n+m && j<n && k<m ;i++) {
      if(sortedA[j]<sortedB[k]) {
        merged_array[i] = sortedA[j];
        j++;
      }
      else {
        merged_array[i] = sortedB[k];
        k++;
      }
    }
    while(j<n) {
      merged_array[i] = sortedA[j];
      i++; j++;
    }
    while(k<m) {
      merged_array[i] = sortedB[k];
      i++; k++;
    }
    for(int i=0;i<n+m;i++)
    cout<<merged_array[i]<<" ";
    cout<<endl;
  }
  return 0;
}*/
