string missingPanagram(string str){

    int counter[26] = {0};
    for(int i=0;i<str.length();i++) {
        counter[tolower(str[i])-97]++;
    }

    string out = "";
    for(int i=0;i<26;i++) {
        if(counter[i]<1)
        out += char(i+97);
    }

    if(out=="")
    return "-1";
    else
    return out;
}