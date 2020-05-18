void pSet(string s,vector<string> &res,int index=0,string curr="") {

    int n = s.length();

    if(index==n) {
        res.push_back(curr);
        return;
    }

    pSet(s,res,index+1,curr+s[index]);
    pSet(s,res,index+1,curr);
}

vector<string> powerSet(string s) {
    vector<string> res;
    pSet(s,res);

    return res;
}