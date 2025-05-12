package pertemuan_8.latihan_3;

import pertemuan_8.Node;

public class StrukturList {
    Node HEAD;

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        }
        else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println ("Matakuliah: "
                        +curNode.getData().getKode()+" "
                        +curNode.getData().getNama()+" "
                        +curNode.getData().getSks());
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return (HEAD == null);
    }
}
