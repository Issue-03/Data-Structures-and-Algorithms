void sortedStack(stack<int> input) {

    stack<int> output; 

    while(!input.empty()) {

        int temp = input.top();
        input.pop();

        while(!output.empty() && output.top()>temp) {

            input.push(output.top());
            output.pop();
        } 
        output.push(temp);
    }
    return output;
}