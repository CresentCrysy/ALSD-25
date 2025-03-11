package W_4;
import java.util.Scanner;
public class CafeDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cafe25.tampilkanMenu();
        System.out.print("Masukan banyak menu yang akan di pesan: ");
        int jumlah = sc.nextInt(); 
        Cafe25[] arrayOfObjectCafe25 = new Cafe25[jumlah];
        for (int i=0; i<jumlah;i++){
            System.out.print("Masukan menu yang akan dipesan: ");
            arrayOfObjectCafe25[i].resp = sc.nextInt();
            if (arrayOfObjectCafe25[i].resp == 1) {
                Cafe25.banyakKopi+=1;
            }
            else if (arrayOfObjectCafe25[i].resp == 2) {
                Cafe25.banyakTeh+=1;
            }
            else if (arrayOfObjectCafe25[i].resp == 3) {
                Cafe25.banyakMie+=1;
            }
        }
        Cafe25.cetakPesanan();
        System.out.println("Total yang harus dibayar: "+Cafe25.hitungTotal());
    }   
}
