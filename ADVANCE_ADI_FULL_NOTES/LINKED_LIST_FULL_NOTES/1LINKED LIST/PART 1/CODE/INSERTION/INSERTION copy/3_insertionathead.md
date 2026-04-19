# Java Linked List Implementation (Insert at Head & Display)

## Introduction
This program demonstrates the implementation of a simple singly linked list in Java. It includes creating a Node class, inserting a node at the beginning (head), and traversing the linked list to display its elements.

---

## Java Implementation

class Node {
    int val;
    Node next;

    Node(int data) {
        val = data;
        next = null;
    }
}


public class Main {

    // Insert at Head (Time Complexity: O(1))
    public static Node insertAtHead(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }


    // Display / Traverse (Time Complexity: O(n))

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertAtHead(head, 2);
        display(head);

        head = insertAtHead(head, 1);
        display(head);
    }
}



# Important Difference (C++ vs Java)

- In C++, head can be passed by reference:

- void insertAtHead(Node* &head, int val)


# But in Java:

- Everything is pass-by-value.

- Therefore, we must return the updated head.

- That is why we write:

- head = insertAtHead(head, 2);

 # Output
- 2-NULL
- 1-2-NULL

# Time Complexity

- insertAtHead() → O(1)

- display() → O(n)