package pertemuan_8.test_3;

import pertemuan_8.Node;
import pertemuan_8.latihan_1.Matakuliah;

public class StrukturList {
    Node HEAD;

    public void addMid(Matakuliah data, int position) {
        Node newNode = new Node(data);

        if (HEAD == null || position <= 1) {
            newNode.setNext(HEAD);
            HEAD = newNode;
            return;
        }

        Node curNode = HEAD;
        Node prevNode = null;
        int i = 1;

        while (curNode != null && i < position) {
            prevNode = curNode;
            curNode = curNode.getNext();
            i++;
        }

        prevNode.setNext(newNode);
        newNode.setNext(curNode);
    }
}