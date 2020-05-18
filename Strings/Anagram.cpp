bool isAnagram(string c, string d){
    
    int countC[26] = { 0 };
    int countD[26] = { 0 };
    
    for(int i=0;i<c.length();i++)
    countC[c[i]-97]++;
    
    for(int i=0;i<d.length();i++)
    countD[d[i]-97]++;
    
    for(int i=0;i<26;i++) {
        if(countC[i]!=countD[i])
        return false;
    }
    return true;
}