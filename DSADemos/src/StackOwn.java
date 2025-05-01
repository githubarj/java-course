

public class StackOwn {

    public static class Stack {
        private int[] arr = new int[5];
        int top;
        int size;

        public Stack() {
            size = arr.length;
            top = -1;
        }

        public void push(int data) {

            if (top < size) {
                arr[++top] = data; // pre-increment , it increments top first then uses the new value
            } else {
                System.out.println("Error: Stack overflow");
            }

        }

        public void printStack() {
            for (int n : arr) {
                System.out.print(n + " ");
            }
        }

        public int pop() {
            if (top == -1) {
                System.out.println("Error: Stack Underflow");
                return -1;
            }
            int n = arr[top];
            arr[top--] = 0; // using post decrement to decrement top after it has been used
            return n;
        }

        public int peek() {
            if (top == -1) {
                System.out.println("The stack is empty");
                return -1;
            }
            return arr[top];
        }
    }

    public static void main(String[] args) {

        Stack nums = new Stack();

        nums.push(5);
        nums.push(10);
        nums.push(15);
        nums.push(56);
        nums.push(67);
        System.out.println(nums.pop());
        System.out.println(nums.peek());

//        nums.push(78);


        nums.printStack();

    }
}
