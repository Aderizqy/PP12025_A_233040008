package pertemuan_8.latihan_2;
import pertemuan_8.Node;
import pertemuan_8.latihan_1.Matakuliah;

public class StrukturList {
    Node HEAD;

    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public boolean isEmpty() {
        return (HEAD == null);
    }

}
