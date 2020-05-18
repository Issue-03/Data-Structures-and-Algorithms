// Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
// Input:
// 2
// 4
// 1 5 3 2
// 3
// 3 2 7
// Output:
// 2
// -1

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
    int a[n], answer=0;
    for(int i=0;i<n;i++)
    cin>>a[i];

    sort(a,a+n);

    for(int i=n-1;i>1;i--) {
      int j=0;
      int k=i-1;

      while(j<k) {
        if(a[j]+a[k]==a[i]) {
          answer++;
          j++;
          k--;
        }
        else if(a[j]+a[k]<a[i])
        j++;
        else
        k--;
      }
    }

    if(!answer)
    cout<<-1<<endl;
    else
    cout<<answer<<endl;

  }
  return 0;
}


/*#include <iostream>
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
int max_val = 0;
for(int i=0;i<n;i++){
cin>>a[i];
max_val = max(max_val,a[i]);
}
int freq[max_val+1] = {0} ;
for(int i=0;i<n;i++)
freq[a[i]]++;
int ans = 0;

ans += ( freq[0] * (freq[0] - 1) * (freq[0]-2) ) / 6;

for(int i=1; i<=max_val ;i++)
ans += freq[0] * freq[i] * (freq[i] - 1) / 2;

for(int i=1; 2*i<=max_val ;i++)
ans += freq[i] * (freq[i] - 1) / 2 * freq[2*i];

for(int i=1;i<=max_val;i++)
for(int j=i+1;i+j<=max_val;j++)
ans += freq[i] * freq[j] * freq[i+j];

if(ans==0)
cout<<"-1"<<endl;
else
cout<<ans<<endl;

}
return 0;
}*/
