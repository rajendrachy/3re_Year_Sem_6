#include<iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = nullptr;
    }
};

class CircularList {
private:
    Node* head;
    Node* tail;
public:
    CircularList() {
        head = tail = nullptr;
    }

    //------------insertAtHead------------------------
    void insertAtHead(int val) {
        Node* newNode = new Node(val);  // creating a new node
        if (head == nullptr) {  // Empty list case
            head = tail = newNode;
            tail->next = head;  // make this circular
        } else {
            newNode->next = head;
            head = newNode;
            tail->next = head;  // Update tail's next to point to the new head
        }
    }

    //---------------insertAtTail--------------------------------
    void insertAtTail(int val) {
        Node* newNode = new Node(val);
        if (tail == nullptr) {  // Empty list case
            head = tail = newNode;
            tail->next = head;  // make this circular
        } else {
            tail->next = newNode;
            tail = newNode;
            tail->next = head;  // Update tail's next to point to head
        }
    }

    //---------------------deleteAtHead-----------------------
    void deleteAtHead() {
        if (head == nullptr) return;  // List is empty

        if (head == tail) {  // Single node case
            delete head;
            head = tail = nullptr;
        } else {  // 2 or more nodes
            Node* temp = head;
            head = head->next;
            tail->next = head;
            temp->next = nullptr;  // Disconnect the old head node
            delete temp;
        }
    }

    //---------------deleteAtTail------------------------------
    void deleteAtTail() {
        if (head == nullptr) return;  // List is empty

        if (head == tail) {  // Single node case
            delete head;
            head = tail = nullptr;
        } else {  // 2 or more nodes
            Node* temp = head;
            while (temp->next != tail) {
                temp = temp->next;
            }
            temp->next = head;
            delete tail;
            tail = temp;
        }
    }

    //--------------traversing------------------
    void display() {
        if (head == nullptr) {
            cout << "List is empty!" << endl;
            return;
        }


        Node* temp = head;
        do {
            cout << temp->data << " ";
            temp = temp->next;
        } while (temp != head);  // Continue until we reach the head again
        cout << endl;
    }
};


int main() {
    CircularList cll;
    
    // Inserting at head
    cll.insertAtHead(1);
    cll.insertAtHead(2);
    cll.insertAtHead(3);
    cll.display();  // Output: 3 2 1

    // Inserting at tail
    cll.insertAtTail(10);
    cll.insertAtTail(20);
    cll.insertAtTail(30);
    cll.display();  // Output: 3 2 1 10 20 30

    // Deleting at head
    cll.deleteAtHead();
    cll.display();  // Output: 2 1 10 20 30

    // Deleting at tail
    cll.deleteAtTail();
    cll.display();  // Output: 2 1 10 20

    return 0;
}
