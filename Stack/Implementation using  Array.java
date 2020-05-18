class Stack {
    static final int MAX = 500;
    int top;
    int[] stack;

    Stack() {
        top = -1;
        stack = new int[MAX];
    }

    boolean isEmpty() {
        return (top<0);
    }

    boolean push(int element) {
        
        if(top>=MAX-1) {
            System.out.println("STACK OVERFLOW!");
            return false;
        }

        stack[++top] = element;
        System.out.println(element," is pushed into the stack.");
        return true;
    }

    int pop() {

        if(top<0) {
            System.out.println("STACK UNDERFLOW!");
            return 0;
        }

        int element = a[top--];
        return element;
    }
}

class Main {

    public static void main(String args[]) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.pop();
    }
}