package W_4;

public class Cafe25 {
    static int hargaKopi = 10000, hargaTeh = 5000, hargaMie = 15000;
    static int banyakKopi, total, banyakTeh, banyakMie, resp;

    public static void tampilkanMenu() {
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Mie");
    }

    public static int hitungTotal() {
        total = hargaKopi * banyakKopi + hargaTeh * banyakTeh + hargaMie * banyakMie;
        return total;
    }
    
    public static void cetakPesanan() {
        if (banyakKopi!=0) {
            System.out.println("Kopi: "+banyakKopi);
        }
        if (banyakTeh!=0) {
            System.out.println("Teh: "+banyakTeh);
        }
        if (banyakMie!=0) {
            System.out.println("Mie: "+banyakMie);
        }
    }
}
