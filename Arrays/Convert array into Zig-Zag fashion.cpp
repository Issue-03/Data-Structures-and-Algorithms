// Given an array A (distinct elements) of size N. Rearrange the elements of array in zig-zag fashion. The converted array should be in form a < b > c < d > e < f. The relative order of elements is same in the output i.e you have to iterate on the original array only.
// Input:
// 2
// 7
// 4 3 7 8 6 2 1
// 4
// 1 4 3 2
// Output:
// 3 7 4 8 2 6 1
// 1 4 2 3
#include<iostream>
using namespace std;

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

    for(int i=0;i<n-1;i++) {
      if(i%2==0) {
        if(a[i]>a[i+1])
        swap(a[i],a[i+1]);
      }
      else {
        if(a[i]<a[i+1])
        swap(a[i],a[i+1]);
      }
    }
    for(int i=0;i<n;i++)
    cout<<a[i]<<" ";
    cout<<endl;
  }
  return 0;
}
