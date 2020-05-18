// Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.
// Input :
// 2
// 5
// 0 2 1 2 0
// 3
// 0 1 0
//
// Output:
// 0 0 1 2 2
// 0 0 1
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
    int a[n],counter[3]={0};
    for(int i=0;i<n;i++){
      cin>>a[i];
      counter[a[i]]++;
    }
    for(int i=0,j=0;j<3;j++){

      while(counter[j]!=0){
        a[i] = j;
        i++;
        counter[j]--;
      }
    }
    for(int i=0;i<n;i++)
    cout<<a[i]<<" ";
    cout<<endl;

  }
  return 0;
}
