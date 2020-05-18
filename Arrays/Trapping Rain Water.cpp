// Given an array arr[] of N non-negative integers representing height of blocks at index i as Ai where the width of each block is 1. Compute how much water can be trapped in between blocks after raining.
// Structure is like below:
// |  |
// |_|
// We can trap 2 units of water in the middle gap.
// Input:
// 2
// 4
// 7 4 0 9
// 3
// 6 9 9
//
// Output:
// 10
// 0
#include <iostream>
using namespace std;

int findWater(int arr[],int n) {

  int left_max = -1, right_max = -1;
  int water = 0;
  int low = 0, high = n-1;
  while(low<=high) {
    if(arr[low]<arr[high]){

      if(arr[low]>left_max)
      left_max = arr[low];
      else
      water += left_max - arr[low];

      low++;
    }
    else {

      if(arr[high]>right_max)
      right_max = arr[high];
      else
      water += right_max - arr[high];

      high--;
    }
  }
  return water;

}

int findAreaOfWater(int arr[],int n) {

  //This approach takes O(n) extra space
  int left[n],right[n];
  int water = 0;
  left[0] = arr[0];
  right[n-1] = a[n-1];

  for(int i=1;i<n;i++)
  left[i] = max(left[i-1],arr[i]);

  for(int i=n-2;i>=0;i--)
  right[i] = max(right[i+1],arr[i]);

  for(int i=0;i<n;i++)
  water += min(left[i],right[i]) - arr[i];

  return water;

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

    //cout<<findAreaOfWater(a,n)<<endl;
    cout<<findWater(a,n)<<endl;
  }
  return 0;
}
