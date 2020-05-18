// Given a list of non negative integers, arrange them in such a manner that they form the largest number possible.The result is going to be very large, hence return the result in the form of a string.
// Input:
// 2
// 5
// 3 30 34 5 9
// 4
// 54 546 548 60
//
// Output:
// 9534330
// 6054854654
#include <bits/stdc++.h>
using namespace std;

int myCompare(string X, string Y)
{
  // first append Y at the end of X
  string XY = X.append(Y);

  // then append X at the end of Y
  string YX = Y.append(X);

  // Now see which of the two formed numbers is greater
  return XY.compare(YX) > 0 ? 1: 0;
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int T;
  cin>>T;
  while(T--) {
    int n;
    cin>>n;
    vector<string> a(n);
    for(int i=0;i<n;i++) {
      cin>>a[i];
    }
    sort(a.begin(), a.end(), myCompare);

    for (int i=0;i<a.size();i++)
    cout<<a[i];
    cout<<endl;
  }
  return 0;
}
