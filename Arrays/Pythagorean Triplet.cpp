// Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.
// Input:
// 1
// 5
// 3 2 4 6 5
//
// Output:
// Yes
#include <bits/stdc++.h>
using namespace std;

bool checkTriplets(int arr[],int n) {

  int maximum=0;
  for(int i=0;i<n;i++)
  maximum = max(arr[i],maximum);

  int counter[maximum+1]= {0};
  for(int i=0;i<n;i++)
  counter[arr[i]]++;

  for(int i=1;i<maximum;i++) {

    if(counter[i]==0)
    continue;

    for(j=1;j<maximum;j++) {

      if((i==j && counter[i]==1) || counter[j]==0)
      continue;

      int val = sqrt(i*i + j*j);

      if( (val*val) != (i*i + j*j) )
      continue;

      if(val>maximum)
      continue;

      if(counter[val])
      return true;
    }
  }

  return false;
}

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

    if(checkTriplets(a,n))
    cout<<"Yes"<<endl;
    else
    cout<<"No"<<endl;
  }
  return 0;
}
