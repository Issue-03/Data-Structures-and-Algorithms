// Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
// Expected Time Complexity: O(n)
// Input:
// 2
// 6
// 7 10 4 3 20 15
// 3
// 5
// 7 10 4 20 15
// 4
// Output:
// 7
// 15
#include <iostream>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int T;
  cin>>T;
  while(T--) {
    int n,k;
    cin>>n;
    int a[n],max=0;
    for(int i=0;i<n;i++){
      cin>>a[i];
      if(a[i]>max)
      max=a[i];
    }
    cin>>k;
    int counter[max+1]={0},smallest=0;
    for(int i=0;i<n;i++) {
      counter[a[i]]++;
    }
    for(int i=1;i<=max;i++){
      if(counter[i]>0){
        smallest += counter[i] ;
      }
      if(smallest>=k){
        cout<<i<<endl;
        break;
      }
    }
  }
  return 0;
}
