package W_1;
import java.util.Scanner;

public class HitungIPSemester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        String[] namaMatkul = new String[jumlah];
        double[] nilaiAngka = new double[jumlah];
        double[] bobotNilai = new double[jumlah];
        String[] nilaiHuruf = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = input.nextLine();
            System.out.print("Nilai Angka (0-100): ");
            nilaiAngka[i] = input.nextDouble();
            input.nextLine(); 
            bobotNilai[i] = konversiBobot(nilaiAngka[i]);
            nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
        }

        double totalBobot = 0;
        for (int i = 0; i < jumlah; i++) {
            totalBobot += bobotNilai[i];
        }
        double ipSemester = totalBobot / jumlah;
        String nilaiHurufIP = konversiNilaiHuruf(ipSemester * 25); 

        System.out.println("\nHasil Perhitungan IP Semester:");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-20s %-12s %-10s %-10s\n", "Mata Kuliah", "Nilai Angka", "Bobot", "Huruf");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-20s %-12.2f %-10.2f %-10s\n", namaMatkul[i], nilaiAngka[i], bobotNilai[i], nilaiHuruf[i]);
        }
        System.out.println("-----------------------------------------------------------");
        System.out.printf("IP Semester: %.2f (%s)\n", ipSemester, nilaiHurufIP);

        input.close();
    }

    public static double konversiBobot(double nilai) {
        if (nilai >= 80) return 4.0;
        else if (nilai >= 73) return 3.5;
        else if (nilai >= 65) return 3.0;
        else if (nilai >= 60) return 2.5;
        else if (nilai >= 50) return 2.0;
        else if (nilai >= 39) return 1.0;
        else return 0.0;
    }

    public static String konversiNilaiHuruf(double nilai) {
        if (nilai >= 80) return "A";
        else if (nilai >= 73) return "B+";
        else if (nilai >= 65) return "B";
        else if (nilai >= 60) return "C+";
        else if (nilai >= 50) return "C";
        else if (nilai >= 39) return "D";
        else return "E";
    }
}
