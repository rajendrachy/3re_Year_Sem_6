#include<iostream>
using namespace std;


class Node {
    public:
    int val;
    Node* next;


    Node(int data) {
        val = data;
        next = NULL; // NULL => 0(Zero)
    }
};


int main() {
      Node* n = new Node(1);
      cout << n->val << " " << n->next << endl;
    return 0;
}

// # Output
// 1 0









//  ---------- Java code--------------

//  class Node {
//     int val;
//     Node next;

//     Node(int data) {
//         val = data;
//         next = null;   // null in Java - not 0
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Node n = new Node(1);
//         System.out.println(n.val + " " + n.next);
//     }
// }


// # Output
// 1 null







