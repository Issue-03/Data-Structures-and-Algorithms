// Given two arrays X and Y of positive integers, find number of pairs such that xy > yx (raised to power of) where x is an element from X and y is an element from Y.
// Input
// 1
// 3 2
// 2 1 6
// 1 5
//
// Output
// 3
#include <bits/stdc++.h>
using namespace std;

int main(){
  int t;
  cin>>t;
  while(t--){
    int m, n;
    cin>> m>> n;
    vector<int > fx(1001,0), fy(1001,0);
    vector<int> vx(m), vy(n);
    for(int i=0;i<m;i++){
      cin>>vx[i];
      fx[vx[i]]++;
    }
    for(int i=0;i<n;i++){
      cin>>vy[i];
      fy[vy[i]]++;
    }

    long long int count=0, total=0;
    for(int i=2;i<=1000 ;i++){
      count =0;
      if(fx[i]>0){
        for(int j=5;j<=1000;j++){
          if(fy[j]>0){
            if(j>i) {
              count+=fy[j];
            }
          }
        }
        total+=count*fx[i];
      }
    }
    for(int i=1;i<=4;i++){		//Handling exceptions
      if(fx[i]>0){
        count=0;
        for(int j=2;j<=4;j++){
          if(fy[j]>0){
            if((int)pow(i,j)>(int)pow(j,i)){
              count+=fy[j];
            }
          }

        }
        total+=count*fx[i];
      }
    }
    count=0;
    for(int i=2;i<=1000;i++){
      if(fx[i]>0){
        count+=fx[i];
      }
    }
    total+=count*fy[1];
    cout<<total<<endl;
  }
}
