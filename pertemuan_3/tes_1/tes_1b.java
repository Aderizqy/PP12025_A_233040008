package pertemuan_3.tes_1;

import pertemuan_3.latihan_2dan3.StrukturList;

public class tes_1b {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(1);
        list.addTail(4);
        list.addTail(5);
        list.addTail(7);

        System.out.println("Elemen :");
        list.displayElement();
    }
}

