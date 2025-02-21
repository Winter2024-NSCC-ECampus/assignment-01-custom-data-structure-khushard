import java.sql.SQLOutput;

public class CustomLinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    // Constructor
    public CustomLinkedList() {
        head = null;
        size = 0;
    }

    // Adds a new node that contains value to the end of the list.
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Adds a new node that contains value to the start of the list.
    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }
    // Returns the total number of nodes currently in the list.
    public int size(){
        return size;
    }

    // Returns the first node's value
    public Integer head(){
        if (head != null) {
            return head.value;
        } else {
            return null;
        }
    }

    // Returns the last node's value
    public Integer tail() {
        if (head == null) {
            return null;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.value;
    }

    // Returns the nodes value at the index that was given
    public Integer at(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    // Removes the last element from the list
    public void pop(){
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while(current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    // Returns true if the value entered is in the list.
    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Returns the index of the node containing the entered value, or -1 if nothing is found.
    public int find(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }


    // Main method with examples
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        // Test append and prepend
        list.append(11);
        list.append(22);
        list.prepend(5);

        // Testing Head, tail, and size methods.
        System.out.println("Size of list: " + list.size());
        System.out.println("Head: " + list.head());
        System.out.println("Tail: " + list.tail());

        // testing at() method
        System.out.println("At: " + list.at(1));

        // Testing contains and find
        System.out.println("Contains 11: " + list.contains(11));
        System.out.println("Index of 22: " + list.find(22));

        // Testing pop
        list.pop();
        System.out.println("Size of list after pop: " + list.size());
    }
}