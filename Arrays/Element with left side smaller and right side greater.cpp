// Given an unsorted array of size N. Find the first element in array such that all of its left elements are smaller and all right elements to it are greater than it.
//
// Note: Left and right side elements can be equal to required element. And extreme elements cannot be required element.
// Input:
// 3
// 4
// 4 2 5 7
// 3
// 11 9 12
// 6
// 4 3 2 7 8 9
//
// Output:
// 5
// -1
// 7
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

    int max[n],min[n];
    max[0] = a[0];
    min[n-1] = a[n-1];
    bool flag = true;
    for(int i=1,j=n-2;i<n&&j>=0;i++,j--) {
      if(a[i]>=max[i-1])
      max[i] = a[i];
      else
      max[i] = max[i-1];

      if(a[j]<=min[j+1])
      min[j] = a[j];
      else
      min[j] = min[j+1];
    }
    for(int i=1;i<n-1;i++) {
      if(max[i]==min[i]) {
        cout<<max[i]<<endl;
        flag = false;
        break;
      }
    }
    if(flag)
    cout<<-1<<endl;
  }
  return 0;
}
