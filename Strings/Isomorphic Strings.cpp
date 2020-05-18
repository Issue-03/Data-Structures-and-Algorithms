bool isIsomorphicString(string strA, string strB) {

    int n = strA.length();
    int m = strB.length();

    if(n!=m)
    return false;

    bool visited[256] = { false };

    int map[256];
    memeset(map,-1,sizeof(map));

    for(int i=0;i<n;i++) {

        if(map[strA[i]]==-1) {

            if(visited[strB[i]])
            return false;

            visited[strB[i]] = true;

            map[strA[i]] = strB[i];
        }
        else if(map[strA[i]]!=strB[i])
        return false;
    }
    return true;
}