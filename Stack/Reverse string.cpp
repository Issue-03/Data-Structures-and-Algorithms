void reverse(char *str, int n)
{

    stack<char> st;
    for(int i=0;i<n;i++) {
        st.push(str[i]);
    }
    for(int i=0;i<n;i++) {
        str[i] = st.top();
        st.pop();
    }
}