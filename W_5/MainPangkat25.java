package W_5;
import java.util.Scanner;
public class MainPangkat25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah elemen: ");
        int elemen = sc.nextInt();
        Pangkat25[]png = new Pangkat25[elemen];
        for (int i=0; i<elemen; i++){
            System.out.print("Masukan nilai basis elemen ke-"+(i+1)+": ");
            int basis = sc.nextInt();
            System.out.print("Masukan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat25(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for(Pangkat25 p:png){
            System.out.println(p.nilai+"^"+p.pangkat +": "+p.pangkatBF());
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for(Pangkat25 p:png){
            System.out.println(p.nilai+"^"+p.pangkat +": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
