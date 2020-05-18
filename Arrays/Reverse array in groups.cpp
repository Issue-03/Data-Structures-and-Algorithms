// Given an array arr[] of positive integers of size N. Reverse every sub-array of K group elements.
// Input
// 2
// 5 3
// 1 2 3 4 5
// 6 2
// 10 20 30 40 50 60
//
// Output
// 3 2 1 5 4
// 20 10 40 30 60 50
#include <iostream>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int T;
  cin>>T;
  while(T--) {
    int n,k;
    cin>>n>>k;
    int a[n];
    for(int i=0;i<n;i++)
    cin>>a[i];

    for(int i=0;i<n;i+=k) {
      int left = i;
      int right = min(i+k-1,n-1);

      while(left<right) {
        swap(a[left],a[right]);
        left++;
        right--;
      }
    }
    for(int i=0;i<n;i++)
    cout<<a[i]<<" ";
    cout<<endl;
  }
  return 0;
}
