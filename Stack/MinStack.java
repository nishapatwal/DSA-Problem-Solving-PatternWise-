package Stack;
class Node {
    int value;
    int min;
    Node next;
    Node(int value, int min) {
        this.value = value;
        this.min = min;
        this.next = null;
    }
}
class MinStack {
    Node head;
    int length = 0;
    public MinStack() {
        this.head = null;
    }
    public void push(int value) {
        if (head == null) {
            head = new Node(value, value);
        } else {
            int currentMin = Math.min(value, head.min);
            Node newNode = new Node(value, currentMin);
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public void pop() {
        head = head.next;
        length--;
    }
    public int top() {
        return head.value;
    }
    public int getMin() {
        return head.min;
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}