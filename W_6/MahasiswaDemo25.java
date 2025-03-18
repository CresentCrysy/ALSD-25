package W_6;
import java.util.Scanner;;
public class MahasiswaDemo25 {
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25();
        System.out.print("Banyak siswa yang mau di input: ");
        m = sc.nextInt();
        Mahasiswa25 [] mhs= new Mahasiswa25[m];
        for (int i = 0; i < m; i++) {
            mhs[i] = new Mahasiswa25();
            System.out.print("Masukan NIM: ");
            sc.nextLine();
            mhs[i].nim = sc.nextLine();
            System.out.print("Masukan Nama: ");
            mhs[i].nama = sc.nextLine();
            System.out.print("Masukan kelas: ");    
            mhs[i].kelas = sc.nextLine();
            System.out.print("Masukan IPK: ");
            mhs[i].ipk = sc.nextDouble();
            list.tambah(mhs[i]);
        }
        
        // Mahasiswa25 m1 = new Mahasiswa25("123", "Zidan", "2A", 3.2);
        // Mahasiswa25 m2 = new Mahasiswa25("124", "Ayu", "2A", 3.5);
        // Mahasiswa25 m3 = new Mahasiswa25("125", "Sofi", "2A", 3.1);
        // Mahasiswa25 m4 = new Mahasiswa25("126", "Sita", "2A", 3.9);
        // Mahasiswa25 m5 = new Mahasiswa25("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.err.println("Data mahasiswa setelah sorting IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        list.insertionSort();
        list.tampil();
    }
}