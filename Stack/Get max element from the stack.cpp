class MyStack {

    stack<int> input;
    int maxEle;

    void getMax() {
        if(input.empty()) {
            return -1;
        }
        else {
            return maxEle;
        }
    }

    int peek() {
        if(input.empty())
        return -1;

        int x = input.top();

        return (x>maxEle) ? maxEle : x;

    }

    int pop() {
        if(input.empty()) {
            return -1;
        }

        int x = input.top();
        input.pop();
        
        if(x>maxEle) {
            int t = maxEle;
            maxEle = 2 * maxEle - x;
            return t;
        }
        return x;
    }

    void push(int x) {
        if(input.empty()) {
            input.push(x);
            maxEle = x;
            return;
        }

        if(x>maxEle) {
            maxEle = x;
            input.push(2 * x - maxEle);
        }
        else 
        input.push(x);

    }
}