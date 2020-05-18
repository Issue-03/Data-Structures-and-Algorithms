// Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
// Input:
// 2
// 5 12
// 1 2 3 7 5
// 10 15
// 1 2 3 4 5 6 7 8 9 10
// Output:
// 2 4
// 1 5

#include <iostream>
using namespace std;

int main() {
  int T;
  cin>>T;
  for(int t=1;t<=T;t++) {
    int N;
    cin>>N;
    int sum;
    cin>>sum;
    int a[N];
    for(int i=0;i<N;i++) {
      cin>>a[i];
    }


    int curr_sum = a[0], start=0,i;
    bool flag = true;
    for(i=1;i<=N;i++) {

      while(curr_sum>sum && start<i-1) {
        curr_sum -= a[start];
        start++;
      }

      if(curr_sum==sum){
        cout<<start+1<<" "<<i<<endl;
        flag=false;
        break;
      }
      if(i<N)
      curr_sum += a[i];
    }
    if(flag)
    cout<<"-1"<<endl;
  }
  return 0;
}
