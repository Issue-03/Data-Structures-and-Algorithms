int search(int m, int n, int x, int mat[][]) {
    
    int i=0,j=n-1;

    while(i<m && j>=0) {

        if(mat[i][j]==x)
        return 1;

        else if(mat[i][j]<x)
        i++;

        else
        j--;
    }

    return 0;
}