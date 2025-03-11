package W_3;
import java.util.Scanner;
public class DosenDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen25[] arrayOfaDosen25 = new Dosen25[3];
        String dummy;

        for (int i = 0; i < arrayOfaDosen25.length; i++) {
            arrayOfaDosen25[i] = new Dosen25(null, null, false, 0);

            System.out.println("Masukan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            arrayOfaDosen25[i].kode = sc.nextLine();
            System.out.print("Nama          : ");
            arrayOfaDosen25[i].nama = sc.nextLine();
            System.out.print("Jenis kelamin (L/P): ");
            dummy = sc.nextLine();
            arrayOfaDosen25[i].jenisKelamin = dummy.equalsIgnoreCase("L");
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            arrayOfaDosen25[i].usia = Integer.parseInt(dummy);
            System.out.println("----------------------------------");
        }

        DataDosen25 dataDosen = new DataDosen25();
        System.out.println("Data Semua Dosen ");
        dataDosen.dataSemuaDosen(arrayOfaDosen25);

        System.out.println("Jumlah Dosen Per Jenis Kelamin ");
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfaDosen25);

        System.out.println("Rata-rata Usia Dosen Per Jenis Kelamin ");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfaDosen25);

        System.out.println("Info Dosen Paling Tua ");
        dataDosen.infoDosenPalingTua(arrayOfaDosen25);

        System.out.println("Info Dosen Paling Muda ");
        dataDosen.infoDosenPalingMuda(arrayOfaDosen25);
    }
}