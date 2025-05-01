public class QueueDemo {
    public static class Queue {
        private int[] arr = new int[5];
        int size;
        int f;
        int r;

        public Queue() {
            f = 0;
            r = -1;
            size = 0;
        }

        public void enqueue(int data) {
            if (size == arr.length) {
                System.out.println("Error: Queue overflow");
                return;
            }
            r = (r + 1) % arr.length;
            arr[r] = data;
            size++;
        }

        public void show() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i < size; i++) {
                System.out.print(arr[(f + 1) % arr.length] + " ");
            }
        }

        public int dequeue() {
            if (size == 0) {
                System.out.println("Error: Queue Underflow");
                return -1;
            }
            int value = arr[f];
            f = (f + 1) % arr.length;
            size--;
            return value;
        }
    }

    public static void main(String[] args) {

        Queue nums = new Queue();

        nums.enqueue(5);
        nums.enqueue(25);
        nums.enqueue(26);
        System.out.println(nums.dequeue());
        nums.show();
    }
}
