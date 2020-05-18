int evaluatePostfix(char* expression) {

    stack<int> postStack;

    for(int i=0;i<n;i++) {
        
        if(isdigit(expression[i]))
        postStack.push(expression[i]-'0');

        else {

            int right = postStack.top();
            postStack.pop();
            int left = postStack.top();
            postStack.pop();

            switch(expression[i]) {

                case '+':
                postStack.push(left+right); break;

                case '-':
                postStack.push(left-right); break;

                case '*':
                postStack.push(left*right); break;

                case '/':
                postStack.push(left/right); break;
            }
        }
    }

    return postStack.top();
}