// Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
// Input:
// 2
// 1
// 1
// 5
// 1 3 5 2 2
//
// Output:
// 1
// 3
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

    int i=0,j=n-1;
    int left = a[i],right = a[j];

    while(i<j) {
      if(left<right) {
        i++;
        left += a[i];
      }
      else if(right<left) {
        j--;
        right += a[j];
      }
      else {
        i++;
        j--;
        left += a[i];
        right += a[j];
      }
    }

    if(left==right && i==j)
    cout<<i+1<<endl;
    else
    cout<<-1<<endl;

  }
  return 0;
}
