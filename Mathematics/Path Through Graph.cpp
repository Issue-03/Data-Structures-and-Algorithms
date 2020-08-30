#include <bits/stdc++.h>
using namespace std;

int gcd(int m, int n){ 
    if (m == 0) 
      return n;  
    return gcd(n % m, m);  
} 
 
int nextLargestFactor(int n) {
    for(int i=2; i<= sqrt(n);i++) {
       if(n%i==0) {
         return n/i;
       }
    }
    return 1;
}

int main()
{
    int m,n;
    cin>>m>>n;
    int hcf = gcd(m,n);
    int answer = 0;
    if(hcf == m) {
      int f = n;
      while(f != hcf && f!=1) {
        f = nextLargestFactor(f);
        answer++;
      }
    }
    else if(hcf == n) {
      int f = m;
      while(f!=hcf && f!=1) {
        f = nextLargestFactor(f);
        answer++;
      }
    }
    else {
      int f1 = m;
      while(f1!=1) {
        f1 = nextLargestFactor(f1);
        answer++;
      }
      int f2 = n;
      while(f2!=1) {
        f2 = nextLargestFactor(f2);
        answer++;
      }
    }
    cout<<answer;
    return 0;
}
