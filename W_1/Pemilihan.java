package W_1;
import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        double nilaiTugas, nilaiKuis, nilaiUts, nilaiUas, nilaiAkhir = 0;
        String nilaiHuruf = "";
        boolean lulus;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai UTS: ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukanilai UAS: ");
        nilaiUas = sc.nextDouble();

        if (nilaiTugas > 100 || nilaiKuis > 100 || nilaiUts > 100 || nilaiUas > 100) {
            System.out.println("Nilai tidak valid");

        } else {
            nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.4);
            if (nilaiAkhir > 80) {
                nilaiHuruf = "A";
                lulus = true;
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
                lulus = true;
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                lulus = true;
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                lulus = true;
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
                lulus = true;
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                lulus = false;
            } else if (nilaiAkhir < 39) {
                nilaiHuruf = "E";
                lulus = false;
            }

            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + nilaiHuruf);

            if (lulus = true) {
                System.out.println("SELAMAT ANDA LULUS");
            } else
                System.out.println("TIDAK LULUS");
        }
    }
}