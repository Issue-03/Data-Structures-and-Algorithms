public class StackLL {
    
    StackNode top;

    static class StackNode {

        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    boolean isEmpty() {
        if(top==null) {
            return true;
        }

        return false;
    }

    void push(int data) {
        StackNode node = new StackNode(data);

        if(top==null) {
            top = node;
        }
        else {
            StackNode temp = top;
            top = node;
            node.next = temp;
        }
        System.out.println(data," is pushed into the stack.");
    }

    int pop() {
        int popped = Integer.MIN_VALUE;

        if(top==null)
        System.out.println("STACK IS EMPTY!");
        else {
            popped = top.data;
            top = top.next;
        }
        return popped;
    }
    
    int peek() {
        if(top==null) {
            System.out.println("STACK IS EMPTY!");
            return Integer.MIN_VALUE;
        }

        return top.data;
    }
}

class Main {

    public static void main(String args[]) {

        StackLL st = new StackLL();

        st.push(10);
        st.push(20);
        st.pop();
    }
}