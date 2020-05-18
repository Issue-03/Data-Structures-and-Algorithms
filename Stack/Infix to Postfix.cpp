int prec(char c) {

    if(c=='^')
    return 3;
    else if(c=='*' || c=='/')
    return 2;
    else if(c=='+' || c=='-')
    return 1;
    else 
    return -1;

}

string infixToPostfix(string input) {

    stack<int> st;
    st.push(' ');

    string output;

    for(int i=0;i<n;i++) {

        if(isalpha(input[i])) 
        output += input[i];

        else if(input[i]=='(')
        st.push(input[i]);

        else if(input[i]==')') {

            while(st.top()!=' ' && st.top!='(') {

                char c = st.top();
                st.pop();
                output += c;
            }
            if(st.top()=='(')
            st.pop();
        }

        else {

            while(st.top()!=' ' && prec(s[i]) <= prec(st.top())) {

                char c = st.top();
                st.pop();
                output += c;
            }
            st.push(s[i]);
        }
    }

    while(st.top()!=' ') {
        char c = st.top();
        st.pop();
        output += c;
    }

    return output;
}