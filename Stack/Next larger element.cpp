vector<long long int> nextGreaterElement(long long arr[],int n) {

    stack<int> st;
    vector<long long int> ans(n,0);
    st.push(0);

    for(int i=1;i<n;i++) {

        if(st.empty()) {
            st.push(i);
            continue;
        }

        while(s.empty()==false && arr[st.top]<arr[i]) {
            ans[st.top()] = arr[i];
            st.pop();
        }
        st.push(i);
    }

    while(st.empty()==false) {
        ans[st.top()] = -1;
        st.pop();
    }

    return ans;
}