// Given an array of positive integers. Your task is to find the leaders in the array.
// Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader.
// 3
// 6
// 16 17 4 3 5 2
// 5
// 1 2 3 4 0
// 5
// 7 4 5 7 3
// Output:
// 17 5 2
// 4 0
// 7 7 3

#include <bits/stdc++.h>
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

    int max_now = -1;
    vector<int> answer;
    for(int i=n-1;i>=0;i--) {
      if(a[i]>=max_now) {
        answer.push_back(a[i]);
        max_now = a[i];
      }
    }

    for(auto i = answer.rbegin(); i != answer.rend(); i++)
    cout<< *i <<" ";
    cout<<endl;

  }
  return 0;
}
