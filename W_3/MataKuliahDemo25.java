package W_3;

import java.util.Scanner;

public class MataKuliahDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        MataKuliah25[] arrayOfMataKuliah25 = new MataKuliah25[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            String kode = sc.nextLine();
            System.out.print("Nama        : ");
            String nama = sc.nextLine();
            System.out.print("SKS         : ");
            int sks = sc.nextInt();
            System.out.print("Jumlah jam  : ");
            int jumlahJam = sc.nextInt();
            sc.nextLine(); 
            System.out.println("--------------------------");

            arrayOfMataKuliah25[i] = new MataKuliah25(kode, nama, sks, jumlahJam);
        }

        System.out.println("\nData Mata Kuliah:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah25[i].cetakInfo();
            System.out.println();
        }
    }
}