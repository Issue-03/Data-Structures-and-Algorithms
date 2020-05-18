void search(char *text, char *pattern) {

    int patLen = strlen(pattern);
    int txtLen = strlen(text);

    for(int i=0;i<=txtLen-patLen;i++) {
        int j;
        for(j=0;j<patLen;j++) {

            if(text[i+j]!=pattern[j]) {
                break;
            }
        }
        if(j==patLen) {
            cout<<"Pattern Found At Index = "<<i<<endl;
        }
    }
}