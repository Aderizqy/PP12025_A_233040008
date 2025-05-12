package pertemuan_8.test_2;

import pertemuan_8.Node;
import pertemuan_8.latihan_1.Matakuliah;

public class StrukturList {
    Node HEAD;

    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }


    public boolean isEmpty() {
        return (HEAD == null);
    }
}
