

public class OwnLinked {

    public static class Node {
        int data;
        Node next; // since it must point to a node

        // constructor for the node
        public Node(int data) {
            this.data = data;
            next = null; // initialize the node with the next address as null since it is last in
        }
    }

    public static class LinkedList {

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

        public void printValues() {
            Node current = head;

            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }

        public void addBegining(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void pop() {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }

        public void delete(int data) {
            // in case of an empty list
            if (head == null) {
                System.out.println("List is empty");
                return;
            }


            // handle deleting head node
            if (head.data == data) {
                head = head.next; // just set the head to the next value after current head
                return;
            }
            Node current = head;
            Node prev = null; // keep track of previous node

            while (current != null && current.data != data) {
                prev = current; // keep track
                current = current.next;  // change to next
            }

            // if the value does not exist
            if (current == null) {
                System.out.println("Node with data " + data + " not found");
                return;
            }

            prev.next = current.next;
        }

    }

    // the node is garbage collected by the JVM because it had no node referencing it

    public static void main(String[] args) {
        LinkedList nums = new LinkedList();

        nums.add(5);
        nums.add(9);
        nums.add(10);
        nums.add(11);
        nums.addBegining(120);
        nums.pop();
        nums.delete(9);

        nums.printValues();
    }


}
