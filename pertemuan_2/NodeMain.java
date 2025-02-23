package pertemuan_2;

public class NodeMain {

    public static void main(String[] args) {
        // Membuat 2 buah node dengan nilai
        Node n1 = new Node(5);
        Node n2 = new Node(7);

        // Membuat relasi antar node
        n1.setNext(n2);

        // Menampilkan nilai node secara berurutan
        Node p = n1; // Pointer p digunakan untuk menelusuri linked list dari awal hingga akhir
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}