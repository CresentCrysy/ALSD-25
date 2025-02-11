package W_1;
import java.util.Scanner;
public class Kubus {
    public static void main(String[] args) {
        int sisi;
        Scanner sc = new Scanner(System.in);
        int response;
        while (true) {
            System.out.println("1. Volume");
            System.out.println("2. Luas permukaan");
            System.out.println("3. Keliling");
            System.out.print("Pilih satu: ");
            response = sc.nextInt();
            
            if (response==1) {
                System.out.print("Masukan panjang sisi: "); 
                sisi = sc.nextInt();
                int Volume = sisi*sisi*sisi;
                System.out.print("Volume = "+Volume);
                break;
            }

            if (response==2) {
                System.out.print("Masukan panjang sisi: "); 
                sisi = sc.nextInt();
                int Luas = 6*(sisi*sisi);
                System.out.print("Luas = "+Luas);
                break;
            }

            if (response==3) {
                System.out.print("Masukan panjang sisi: "); 
                sisi = sc.nextInt();
                int keliling = 12*sisi;
                System.out.print("keliling = "+keliling);
                break;
            }
        }
    }
}
