int strstr(string s, string x)
{
    int m = x.length();
    int n = s.length();
    for(int i=0;i<=n-m;i++) {
        int j=0;
        
        while(j<m) {
            if(s[i+j]!=x[j])
            break;
            j++;
        }
        if(j==m)
        return i;
    } 
    return -1;
}