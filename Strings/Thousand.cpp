class Solution {
public:
    string thousandSeparator(int n) {
        string str = to_string(n);
        if(n <= 999) {
            return str;
        }
        string out = "";
        for(int i = str.length() -1; i>=0;) {
            int count = 0;
            while(count!=3 && i>=0) {
                out += str[i];
                count++;
                i--;
            }
            if(count == 3 && i>=0)
            out += ".";
        }
        reverse(out.begin(), out.end());
        return out;
    }
};