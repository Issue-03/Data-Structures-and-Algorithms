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
    int a[n+1] = {0} ;
    for(int i=1;i<n;i++) {
      int temp;
      cin>>temp;
      a[temp]++;
    }
    for(int i=1;i<=n;i++) {
      if(a[i]==0) {
        cout<<i<<endl;
        break;
      }
    }
  }
  return 0;
}
