package practicing.three;


class Node {
    int data;
    Node next;

    // Constructor for each Node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedListExample {
    Node head; // Head of the custom linked list

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Display the manually created linked list
    public void display() {
        Node current = head;

        System.out.print("Manual Singly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Manual Linked List
        SinglyLinkedListExample myList = new SinglyLinkedListExample();
        myList.insert(10);
        myList.insert(20);
        myList.insert(30);
        myList.display();


    }
}
