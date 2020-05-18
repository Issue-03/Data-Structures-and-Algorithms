// Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
// Input
// 2
// 5
// 1 2 3 -2 5
// 4
// -1 -2 -3 -4
// Output
// 9
// -1

#include<iostream>
#include<climits>
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

    int local_max = 0, global_max = INT_MIN;

    for(int i=0;i<n;i++) {
      local_max = local_max + a[i];

      if(global_max<local_max)
      global_max = local_max;

      if(local_max<0)
      local_max = 0;
    }
    if(global_max==INT_MIN) {
      for(int i=0;i,n;i++)
      global_max = max(global_max,a[i]);
    }
    cout<<global_max<<endl;
  }
  return 0;
}
