package W_2;

public class MataKuliah25 {
    String kodeMK, nama;
    int sks, jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode MK: "+kodeMK);
        System.out.println("Nama MK: "+nama);
        System.out.println("SKS: "+sks);
        System.out.println("Jumlah jam: "+jumlahJam);
    }

    void ubahSks(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diubah");
    }

    void tambahJam(int jam){
        jumlahJam = jumlahJam+jam;
        System.out.println("Jam berhasil diubah"); 
    }

    void kurangiJam(int jam){
        if (jumlahJam<jam) {
            System.out.println("Jam tidak bisa dikurangi");
        }
        else {
            jumlahJam = jumlahJam-jam;
            System.out.println("Jam berhasil diubah");
        }
    }
}
