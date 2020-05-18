void permute(string str,int l,int r) {

    if(l==r)
    cout<<str<<" ";

    else  {
        for(int i=l;i<=r;i++) {
            swap(str[l],str[i]);
            sort(str.begin()+l+1,str.end());
            permute(str,l+1,r);
            swap(str[l],str[i]);
        }
    }
}

void permutation(string str) {

    int l = 0,r = str.length() - 1;
    sort(str.begin(),str.end());

    permute(str,l,r);
}

// using STL
/*void permute(string str) {

    sort(str.begin(),str.end());
    do {
        cout<<str<<" ";
    }while(next_permutation(str.begin(),str.end()));
 }*/