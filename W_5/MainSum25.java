package W_5;
import java.util.Scanner;
public class MainSum25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah elemen: ");
        int elemen = sc.nextInt();

        Sum25 sm = new Sum25(elemen);
        for (int i=0; i<elemen;i++){
            System.out.print("Masukan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan BruteForce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
