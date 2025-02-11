package W_1;
public class Fungsi {
    static final int HARGA_AGLONEMA = 75000;
    static final int HARGA_KELADI = 50000;
    static final int HARGA_ALOCASIA = 60000;
    static final int HARGA_MAWAR = 10000;

    static int[][] stokBunga = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}    
    };

    public static void hitungPendapatan() {
        System.out.println("Pendapatan setiap cabang jika semua bunga terjual:");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = (stokBunga[i][0] * HARGA_AGLONEMA) +
                             (stokBunga[i][1] * HARGA_KELADI) +
                             (stokBunga[i][2] * HARGA_ALOCASIA) +
                             (stokBunga[i][3] * HARGA_MAWAR);
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }

    public static void totalStokPerJenis() {
        int totalAglonema = 0, totalKeladi = 0, totalAlocasia = 0, totalMawar = 0;

        for (int i = 0; i < stokBunga.length; i++) {
            totalAglonema += stokBunga[i][0];
            totalKeladi += stokBunga[i][1];
            totalAlocasia += stokBunga[i][2];
            totalMawar += stokBunga[i][3];
        }

        System.out.println("\nTotal stok setiap jenis bunga di semua cabang:");
        System.out.println("Aglonema: " + totalAglonema);
        System.out.println("Keladi  : " + totalKeladi);
        System.out.println("Alocasia: " + totalAlocasia);
        System.out.println("Mawar   : " + totalMawar);
    }

    public static void main(String[] args) {
        hitungPendapatan();
        totalStokPerJenis();
    }
}
