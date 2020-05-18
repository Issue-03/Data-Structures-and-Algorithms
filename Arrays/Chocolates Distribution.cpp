// Given an array A of positive integers of size N, where each value represents number of chocolates in a packet. Each packet can have variable number of chocolates. There are M students, the task is to distribute chocolate packets such that :
// 1. Each student gets one packet.
// 2. The difference between the number of chocolates given to the students having packet with maximum chocolates and student having packet with minimum chocolates is minimum.
// Input:
// 2
// 8
// 3 4 1 9 56 7 9 12
// 5
// 7
// 7 3 2 4 9 12 56
// 3
//
// Output:
// 6
// 2
#include <bits/stdc++.h>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int T;
  cin>>T;
  while(T--) {
    int n,m;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    cin>>a[i];
    cin>>m;

    sort(a,a+n);
    int min = a[m-1] - a[0];
    for(int i=1,j=k;i<n&&j<n;i++,j++) {
      if(a[j]-a[i]<min)
      min = a[j] - a[i];
    }
    cout<<min<<endl;
  }
  return 0;
}
