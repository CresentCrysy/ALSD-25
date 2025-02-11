package W_1;
import java.util.Scanner;

public class JadwalKuliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        String[] namaMatkul = new String[jumlah];
        int[] sks = new int[jumlah];
        int[] semester = new int[jumlah];
        String[] hariKuliah = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = input.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = input.nextInt();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = input.nextLine();
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMatkul, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang dicari: ");
                    String hari = input.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMatkul, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang dicari: ");
                    int sem = input.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMatkul, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String namaCari = input.nextLine();
                    cariMataKuliah(namaMatkul, sks, semester, hariKuliah, namaCari);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    public static void tampilkanSeluruhJadwal(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal Kuliah pada hari " + hari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada hari tersebut.");
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\nJadwal Kuliah Semester " + sem + ":");
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (semester[i] == sem) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada semester tersebut.");
        }
    }

    public static void cariMataKuliah(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String namaCari) {
        System.out.println("\nHasil pencarian untuk mata kuliah: " + namaCari);
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (namaMatkul[i].equalsIgnoreCase(namaCari)) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
