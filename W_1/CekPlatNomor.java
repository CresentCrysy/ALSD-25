package W_1;
import java.util.Scanner;

public class CekPlatNomor {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' '},  
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' '},  
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' '},  
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' '},  
            {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' '},  
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' '},  
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' '},  
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' '},  
            {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '},  
            {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };

        Scanner sc = new Scanner(System.in);
        boolean ditemukan = false;
        
        System.out.print("Masukkan kode plat nomor (contoh: A, B, D): ");
        char kodeInput = sc.next().toUpperCase().charAt(0); 
        
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodeInput) {
                System.out.println("Kode plat " + kodeInput + " berasal dari kota: " + new String(KOTA[i]).trim());
                ditemukan = true;
                break;
            }
        }        

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
