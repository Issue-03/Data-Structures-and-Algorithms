// Given arrival and departure times of all trains that reach a railway station. Your task is to find the minimum number of platforms required for the railway station so that no train waits.
//
// Note: Consider that all the trains arrive on the same day and leave on the same day. Also, arrival and departure times will not be same for a train, but we can have arrival time of one train equal to departure of the other. In such cases, we need different platforms, i.e at any given instance of time, same platform can not be used for both departure of a train and arrival of another.
// Input:
// 2
// 6
// 0900  0940 0950  1100 1500 1800
// 0910 1200 1120 1130 1900 2000
// 3
// 0900 1100 1235
// 1000 1200 1240
//
// Output:
// 3
// 1
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
    int a[n],d[n];
    for(int i=0;i<n;i++)
    cin>>a[i];
    for(int i=0;i<n;i++)
    cin>>d[i];

    int observer[2401] = {0};
    for(int i=0;i<n;i++) {
      observer[a[i]]++;
      observer[d[i]+1]--;
    }
    int max_platforms = 0, sum_till_now = 0;
    for(int i=0;i<2400;i++) {
      sum_till_now += observer[i];
      if(sum_till_now>max_platforms)
      max_platforms = sum_till_now;
    }
    cout<<max_platforms<<endl;
  }
  return 0;
}
