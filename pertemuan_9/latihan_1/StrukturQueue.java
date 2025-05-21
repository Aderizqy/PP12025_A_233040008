package pertemuan_9.latihan_1;

import pertemuan_9.Node;

public class StrukturQueue {
    Node FRONT;
    Node REAR;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        }
        else {
            REAR.setNext (newNode);
            REAR = newNode;
        }
    }

    public boolean isEmpty() {
        return (FRONT == null);
    }
}
