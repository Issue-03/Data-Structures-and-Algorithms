// Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on...
//
// Note: O(1) extra space is allowed. Also, try to modify the input array as required.
// Input:
// 2
// 6
// 1 2 3 4 5 6
// 11
// 10 20 30 40 50 60 70 80 90 100 110
//
// Output:
// 6 1 5 2 4 3
// 110 10 100 20 90 30 80 40 70 50 60


// With extra  space
#include <iostream>
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

    int ans[n];
    for(int i=0,j=n-1,k=0; i<=j && k<n;i++,j--) {
      ans[k] = a[j];
      ans[k+1] = a[i];
      k += 2;
      if(k==n-1 && n%2) {
        j--;
        ans[k] = a[j];
      }
    }

    for(int i=0;i<n;i++)
    cout<<ans[i]<<" ";
    cout<<endl;

  }
  return 0;
}
