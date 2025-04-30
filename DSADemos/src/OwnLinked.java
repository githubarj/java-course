

public class OwnLinked {

    public static class Node {
        int data;
        Node next; // since it must point to a node

        // constructor for the node
        public Node(int data){
            this.data = data;
            next = null; // initialize the node with the next address as null since it is last in
        }
    }

    public static class LinkedList{

        Node head = null; // create head node

        public void add(int data) {
            Node newNode = new Node(data); // Initialize a new node with the data

            if (head == null) {
                head = newNode; // If the list is empty, set the new node as the head
            } else {
                Node current = head; // Start from the head node
                while (current.next != null) {
                    current = current.next; // Traverse to the end of the list
                }
                current.next = newNode; // Set the new node as the next node of the last node
            }
        }

        public void printValues (){
            Node current = head;

            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }

    public static void main (String[] args){
        LinkedList nums = new LinkedList();

        nums.add(5);
        nums.add(9);
        nums.add(10);

        nums.printValues();
    }


}
