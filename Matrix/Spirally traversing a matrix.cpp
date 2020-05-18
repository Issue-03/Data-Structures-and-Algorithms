// Input:
// 2
// 4 4
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
// 3 4
// 1 2 3 4 5 6 7 8 9 10 11 12
//
// Output:
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
// 1 2 3 4 8 12 11 10 9 5 6 7
#include <iostream>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int T;
  cin>>T;
  while(T--) {
    int m,n;
    cin>>m>>n;
    int a[m][n];
    for(int i=0;i<m;i++) {
      for(int j=0;j<n;j++)
      cin>>a[i][j];
    }
    int row = 0, col = 0, i;

    while(row<m && col<n) {

      for(i=col;i<n;i++)
      cout<<a[row][i]<<" ";

      row++;

      for(i=row;i<m;i++)
      cout<<a[i][n-1]<<" ";

      n--;

      if(row<m) {
        for(i=n-1;i>=col;i--)
        cout<<a[m-1][i]<<" ";

        m--;
      }

      if(col<n) {
        for(i=m-1;i>=row;i--)
        cout<<a[i][col]<<" ";

        col++;
      }
    }
    cour<<endl;

  }
  return 0;
}
