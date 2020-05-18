void rotateby90(int n, int a[][]) {
    
    for(int i=0;i<n/2;i++) {
        for(int j=i;j<n-1-i;j++) {
            int temp = a[i][j];

            a[i][j] = a[j][n-1-i];

            a[j][n-1-i] = a[n-1-i][n-1-j];

            a[n-1-i][n-1-j] = a[n-1-j][i];

            a[n-1-j][i] = temp; 
        }

    }
}