bool isBalanced(string input) {

    stack<char> st;

    for(int i=0;i<input.length();i++) {

        if(!st.empty()) {
            if(st.top()=='(' && input[i]==')')
            st.pop();
            else if(st.top()=='{' && input[i]=='}')
            st.pop();
             else if(st.top()=='[' && input[i]==']')
            st.pop();
            else 
            st.push(input[i]);
        }
        else 
        st.push(input[i]);
    }
    if(st.empty())
    return true;
    else 
    return false;
}