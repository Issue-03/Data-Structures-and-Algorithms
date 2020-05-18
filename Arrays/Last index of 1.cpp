// Given a string S consisting only '0's and '1's,  print the last index of the '1' present in it.
// Input:
// 2
// 00001
// 0
// Output:
// 4
// -1
#include <iostream>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int T;
  cin>>T;
  while(T--) {
    string s;
    cin>>s;
    bool flag =true;
    for(int i=s.length()-1;i>=0;i--) {
      if(s[i]=='1') {
        cout<<i<<endl;
        flag = false;
        break;
      }
    }
    if(flag)
    cout<<-1<<endl;

  }
  return 0;
}
