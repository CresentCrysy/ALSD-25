package W_3;

public class MataKuliah25 {
    public String kode, nama;
    public int sks, jumlahJam;
    
    public MataKuliah25(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }
    
    public void cetakInfo() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("SKS  : " + sks);
    }
}