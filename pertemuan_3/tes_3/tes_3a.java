package pertemuan_3.tes_3;

import pertemuan_3.tes_2.addHead;

public class tes_3a {
    public static void main(String[] args) {
        addHead list = new addHead();
        list.addHead(1);
        list.addHead(2);
        list.addHead(3);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}
