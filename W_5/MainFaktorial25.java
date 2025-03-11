package W_5;
import java.util.Scanner;
public class MainFaktorial25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        int nilai = sc.nextInt();
        Faktorial25 fk = new Faktorial25();
        System.out.println("Nilai faktorial "+nilai+" menggunakan BF: "+fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial "+nilai+" menggunakan DC: "+fk.faktorialDC(nilai));
    }
}
