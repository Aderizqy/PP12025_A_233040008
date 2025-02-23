package pertemuan_3.tes_3;

import pertemuan_3.tes_2.addHead;

public class tes_3b {
    public static void main(String[] args) {
        addHead list = new addHead();
        list.addHead(7);
        list.addHead(5);
        list.addHead(4);
        list.addHead(1);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}
