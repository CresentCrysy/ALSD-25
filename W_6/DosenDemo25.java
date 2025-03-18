package W_6;

public class DosenDemo25 {
    public static void main(String[] args) {
        DataDosen25 ds = new DataDosen25();
        Dosen25 d1 = new Dosen25("1", "Yanto", true, 25);
        Dosen25 d2 = new Dosen25("2", "Yanti", false, 30);
        Dosen25 d3 = new Dosen25("3", "Mitski", false, 40);
        Dosen25 d4 = new Dosen25("4", "Bruno", true, 64);

        ds.tambah(d1);
        ds.tambah(d2);
        ds.tambah(d3);
        ds.tambah(d4);

        System.out.println("Sebelum sort: ");
        ds.tampil();
        System.out.println("Setelah BUBBLE SORT (ASC)");
        ds.sortingASC();
        ds.tampil();
        System.out.println("Setelah SELECTION SORT (DESC)");
        ds.sortingDSC();
        ds.tampil();
        System.out.println("Setelah INSERTION SORT (DESC)");
        ds.insertionSort();
        ds.tampil();
    }
}
